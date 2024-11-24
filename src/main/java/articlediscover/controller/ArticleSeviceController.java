package articlediscover.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	
	// call example: http://localhost:8090/articles/555594
	@RequestMapping("/articles/{artNo}")
	public ResponseEntity<Object> getProduct(@PathVariable("artNo") Integer artNo) {
		logger.info("retrievs Article by articleNo");
		 Optional<Article> article = articleFinder.getArticle(artNo);
		
		if (artNo == null) {
	        return new ResponseEntity<>("Article number cannot be null", HttpStatus.BAD_REQUEST);
	    }

	    article = articleFinder.getArticle(artNo);
	    if (article == null) {
	        return new ResponseEntity<>("Article not found", HttpStatus.NOT_FOUND);
	    }

	    return new ResponseEntity<>(article, HttpStatus.OK);
	}

}
