package ma.solide.articlediscover.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.solide.articlediscover.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {

	Optional<Article> findByArticleno(Integer id);
	List<Article> findAll();

	List<Article> findByOldNew(String oldNew);
	
	  @Query("SELECT a FROM Article a WHERE " +
	           "(:oldNew IS NULL OR :oldNew = '' OR a.oldNew = :oldNew) AND " +
	           "(:category IS NULL OR :category = '' OR a.category = :category) AND " +
	           "(:model IS NULL OR :model = '' OR a.model = :model) AND " +
	           "(:type IS NULL OR :type = '' OR a.type = :type) AND " +
	           "(:manufacturer IS NULL OR :manufacturer = '' OR a.manufacturer = :manufacturer)")
	    List<Article> findByDynamicQuery(
	            @Param("oldNew") String oldNew,
	            @Param("category") String category,
	            @Param("model") String model,
	            @Param("type") String type,
	            @Param("manufacturer") String manufacturer);

}
