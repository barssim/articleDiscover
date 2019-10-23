package articleDiscover;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Article;

@RestController
public class ArticleSeviceController {
	private static final Logger logger = LoggerFactory.getLogger(ArticleDiscover.class);
	private static Map<String, Article> ArticleRepo = new HashMap<>();
	   static {	 

	      Article art1 = new Article();
	      art1.setArtNo("123456");
	      art1.setArtName("Parbbrise Renault modus");
	      art1.setArtDestination("chbanat 45 avenue almajd");
	      art1.setArtPrice("550 DH");
	      art1.setArtTransportCost("20 DH");
	      ArticleRepo.put(art1.getArtNo(), art1 );
	      

	      Article art2 = new Article();
	      art2.setArtNo("987654");
	      art2.setArtName("porte passat 3c");
	      art2.setArtDestination("hay almassira1, andalous 55 ");
	      art2.setArtPrice("770 DH");
	      art2.setArtTransportCost("20 DH");
	      ArticleRepo.put(art2.getArtNo(), art2 );
	      
	   }
	   
	   @RequestMapping("/articles/{artNo}")
	   public ResponseEntity<Object> getProduct(@PathVariable("artNo") String artNo) {
		  logger.info("retrievs Article by articleNo");
	      Article article = ArticleRepo.get(artNo);
		   return new ResponseEntity<>(article , HttpStatus.OK);
	   }

}
