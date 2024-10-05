package articlediscover.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;

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

	// call example: http://localhost:8090/articles/555602
	@RequestMapping("/articles/{artNo}")
	public ResponseEntity<Object> getProduct(@PathVariable("artNo") int artNo) {
		logger.info("retrievs Article by articleNo");
		Article article = articleFinder.getArticle(artNo);
		return new ResponseEntity<>(article, HttpStatus.OK);
	}

}
