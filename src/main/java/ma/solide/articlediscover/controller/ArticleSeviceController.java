package ma.solide.articlediscover.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.solide.articlediscover.model.Article;
import ma.solide.articlediscover.service.ArticleFinder;

@RestController
public class ArticleSeviceController {
	private static final Logger logger = LoggerFactory.getLogger(ArticleSeviceController.class);

	@Autowired
	ArticleFinder articleFinder;

//	
//	@RequestMapping("/articles")
//	public ResponseEntity<Object> getAllProducts() {
//		logger.info("retrievs all articles");
//		List<Article> articles = articleFinder.findAllArticles();
//		return new ResponseEntity<Object>(articles, HttpStatus.OK);
//	}
	
	@RequestMapping("/articles/newArticles")
	public ResponseEntity<Object> getNewProducts() {
		logger.info("retrievs all new articles");
		List<Article> articles = articleFinder.findNewArticles();
		return new ResponseEntity<Object>(articles, HttpStatus.OK);
	}
	
	@RequestMapping("/articles/oldArticles")
	public ResponseEntity<Object> getOldProducts() {
		logger.info("retrievs all new articles");
		List<Article> articles = articleFinder.findOldArticles();
		return new ResponseEntity<Object>(articles, HttpStatus.OK);
	}
	
	 @GetMapping("/articles")
	    public ResponseEntity<List<Article>> getArticles(
	            @RequestParam(value = "oldNew", required = false) String oldNew,
	            @RequestParam(value = "category", required = false) String category,
	            @RequestParam(value = "model", required = false) String model,
	            @RequestParam(value = "type", required = false) String type,
	            @RequestParam(value = "manifacturer", required = false) String manifacturer) {
		logger.info("retrievs all filtred articles");
		List<Article> articles = articleFinder.findFiltredArticles( oldNew,  category,  model,  type,  manifacturer);
		 return ResponseEntity.ok(articles);
	}
}
