package ma.solide.articlediscover.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.solide.articlediscover.model.Article;
import ma.solide.articlediscover.repository.ArticleRepository;

@Service
public class ArticleFinder {
	@Autowired
	private ArticleRepository articleRepository;

	public Optional<Article> getArticle(Integer artNo) {
		if (artNo == null) {
	        throw new IllegalArgumentException("Article number cannot be null");
	    }
		 Optional<Article> article = articleRepository.findById(artNo);
		 return article;
}
	
	public  List<Article> findAllArticles()
	{
		return articleRepository.findAll();
	}
	
	public  List<Article> findNewArticles()
	{
		return articleRepository.findByArticleOldNew("New");
	}
	
	public  List<Article> findOldArticles()
	{
		return articleRepository.findByArticleOldNew("old");
	}
}