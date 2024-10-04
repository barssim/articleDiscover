package articlediscover.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import article.ArticleFacade;
import articlediscover.model.Article;
import models.ArticleBean;

@RestController
public class ArticleSeviceController {
	private static final Logger logger = LoggerFactory.getLogger(ArticleSeviceController.class);
	
	Article article = new Article();
	
	private Article mapArticleBean(ArticleBean articleBean)
	{
	      Article art = new Article();
	      art.setArtNo(articleBean.getArticleNo());
	      art.setArtName(articleBean.getArticleName());
	      art.setArtPrice(articleBean.getArticlePrice());
	      //ToDo
	      //art.setArtDestination(...);	
	      //art.setArtTransportCost(...)
	      return art;
		
	}
	   //call example:   http://localhost:8090/articles/555602
	   @RequestMapping("/articles/{artNo}")
	   public ResponseEntity<Object> getProduct(@PathVariable("artNo") int artNo)  {
		  logger.info("retrievs Article by articleNo");
		  ArticleBean articleBean = new ArticleBean();
		try {
			ArticleFacade articleFacade = new ArticleFacade();
			articleBean = articleFacade.getArticleByArticleNo(artNo);
			article = mapArticleBean(articleBean);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return new ResponseEntity<>(article , HttpStatus.OK);
	   }

}
