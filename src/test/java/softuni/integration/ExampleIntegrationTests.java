//package softuni.integration;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.ResponseEntity;
//import org.springframework.mock.web.MockServletContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import softuni.TeamcityApplication;
//
//import javax.servlet.ServletContext;
//
//import static junit.framework.TestCase.assertNotNull;
//import static junit.framework.TestCase.assertTrue;
//import static org.hamcrest.CoreMatchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@RunWith(SpringRunner.class)
////@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ContextConfiguration(classes = {TeamcityApplication.class})
//@WebAppConfiguration
//public class ExampleIntegrationTests {
//
////    @Autowired
////    private WebApplicationContext wac;
////
////    private MockMvc mockMvc;
////    @Before
////    public void setup() throws Exception {
////        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
////    }
////
////    @Test
////    public void givenWac_whenServletContext_thenServletContextShouldNotBeNull() {
////        ServletContext servletContext = wac.getServletContext();
////
////        assertNotNull(servletContext);
////    }
////
////    @Test
////    public void givenWac_whenServletContext_thenServletContextShouldBeMocked() {
////        ServletContext servletContext = wac.getServletContext();
////
////        assertTrue(servletContext instanceof MockServletContext);
////    }
////
////    @Test
////    public void givenWac_whenServletContext_thenItProvidesMathController() {
////
////        assertNotNull(wac.getBean("mathController"));
////    }
////
////    @Test
////    public void givenHomePageURI_whenMockMVC_thenReturnsLayoutViewName() throws Exception {
////        this.mockMvc.perform(get("/")).andDo(print())
////
////                .andExpect(view().name("layout"));
////    }
////
////
////    @Test
////    public void givenAddURIWithPathVariables_whenMockMVC_thenResponseOK() throws Exception {
////        this.mockMvc
////                .perform(get("/{firstOperand}/add/{secondOperand}", 3, 5))
////                .andDo(print())
////                .andExpect(status().isOk());
////
////    }
////
////    @Test
////    public void givenAddURIWithPathVariables_whenMockMVC_thenViewNameIsLayout() throws Exception {
////        this.mockMvc
////                .perform(get("/{firstOperand}/add/{secondOperand}", 3, 5))
////                .andDo(print())
////                .andExpect(view().name("layout"));
////
////    }
////
////    @Test
////    public void givenAddURIWithPathVariables_whenMockMVC_thenResultIsCorrect() throws Exception {
////        this.mockMvc
////                .perform(get("/{firstOperand}/add/{secondOperand}", 3, 5))
////                .andDo(print())
////                .andExpect(model().attribute("result", is(8L)));
////    }
//
//}
