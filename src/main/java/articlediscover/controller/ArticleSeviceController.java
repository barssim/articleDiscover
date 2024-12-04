package articlediscover.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import articlediscover.model.Article;
import articlediscover.service.ArticleFinder;

@RestController
public class ArticleSeviceController {
	private static final Logger logger = LoggerFactory.getLogger(ArticleSeviceController.class);

	@Autowired
	ArticleFinder articleFinder;

	// call example: http://localhost:8090/articles/555606
	@GetMapping("/articles/{artNo}")
	public ResponseEntity<Object> getProductByArtNo(@PathVariable("artNo") Integer artNo) {
		logger.info("retrievs Article by articleNo");
		Optional<Article> article;
		try {

			article = articleFinder.getArticle(artNo);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>("Article number cannot be null", HttpStatus.BAD_REQUEST);
		}

		if (article == null) {
			return new ResponseEntity<>("Article not found", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(article, HttpStatus.OK);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/articles")
	public ResponseEntity<Object> getAllProducts() {
		logger.info("retrievs all articles");
		List<Article> articles = articleFinder.findAllArticles();
		return new ResponseEntity<Object>(articles, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:3000") 
	@RequestMapping("/articles/newArticles")
	public ResponseEntity<Object> getNewProducts() {
		logger.info("retrievs all new articles");
		List<Article> articles = articleFinder.findNewArticles();
		return new ResponseEntity<Object>(articles, HttpStatus.OK);
	}
}
