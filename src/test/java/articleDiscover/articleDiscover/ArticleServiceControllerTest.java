//package articleDiscover.articleDiscover;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class ArticleServiceControllerTest {
//
//
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Test
//	public void testGetProduct()throws Exception {
//        mockMvc.perform(get("/articles/"))
//        .andExpect(status().isOk())
//        .andExpect(content().string("Hello, World!"));
//	}
//
//}
