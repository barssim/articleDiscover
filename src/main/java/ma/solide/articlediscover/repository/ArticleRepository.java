package ma.solide.articlediscover.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.solide.articlediscover.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
	Optional<Article> findById(Integer id);
	List<Article> findAll();
	List<Article> findByArticleOldNew(String articleOldNew);

}
