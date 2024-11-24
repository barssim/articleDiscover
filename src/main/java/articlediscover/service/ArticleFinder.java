package articlediscover.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import articlediscover.model.Article;
import articlediscover.repository.ArticleRepository;

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
}