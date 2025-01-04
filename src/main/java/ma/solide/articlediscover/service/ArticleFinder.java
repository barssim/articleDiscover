package ma.solide.articlediscover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.solide.articlediscover.model.Article;
import ma.solide.articlediscover.repository.ArticleRepository;

@Service
public class ArticleFinder {
	@Autowired
	private ArticleRepository articleRepository;

		
	public  List<Article> findAllArticles()
	{
		return articleRepository.findAll();
	}
	
	public  List<Article> findNewArticles()
	{
		return articleRepository.findByOldNew("New");
	}
	
	public  List<Article> findOldArticles()
	{
		return articleRepository.findByOldNew("old");
	}
	public List<Article> findFiltredArticles(String oldNew, String category, String model, String type, String manufacturer) {
	    return articleRepository.findByDynamicQuery(oldNew, category, model, type, manufacturer);
	}
}