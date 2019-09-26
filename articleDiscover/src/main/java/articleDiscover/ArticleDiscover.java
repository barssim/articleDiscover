package articleDiscover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
	public class ArticleDiscover  extends SpringBootServletInitializer {
//	private static final Logger logger = LoggerFactory.getLogger(ArticleDiscover.class);

	   @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(ArticleDiscover.class);
	   }
	   public static void main(String[] args) {
	      SpringApplication.run(ArticleDiscover.class, args);
	   }
	}