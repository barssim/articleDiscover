package articlediscover.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;

import org.springframework.stereotype.Service;

import article.ArticleFacade;
import articlediscover.model.Article;
import models.ArticleBean;

@Service
public class ArticleFinder {

	public Article getArticle(int artNo) {
		ArticleBean articleBean = new ArticleBean();
		try {
			ArticleFacade articleFacade = new ArticleFacade();
			articleBean = articleFacade.getArticleByArticleNo(artNo);

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
		return mapArticleBean(articleBean);

	}

	private Article mapArticleBean(ArticleBean articleBean) {
		return Article.builder().artNo(articleBean.getArticleNo()).artName(articleBean.getArticleName())
				.artPrice(articleBean.getArticlePrice())
				// ToDo
				// art.setArtDestination(...);
				// art.setArtTransportCost(...)
				.build();

	}
}
