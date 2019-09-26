package articleDiscover;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${spring.application.Desc}")
    private String desc;
	@RequestMapping("/")
     public String home(){
         return "Hello World, this application " + desc ;
     }
 }