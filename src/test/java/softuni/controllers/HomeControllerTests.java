package softuni.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest(MathController.class)
public class HomeControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addMethod_withValidParams_shouldReturnCorrectValue() throws Exception {
        this.mockMvc.perform(get("/3/add/7"))
                .andExpect(status().isOk())
                .andExpect(view().name("layout"))
                .andExpect(model().attribute("result", is(10L)));
    }

    @Test
    public void mulMethod_withValidParams_shouldReturnCorrectValue() throws Exception {
        this.mockMvc.perform(get("/3/mul/7"))
                .andExpect(status().isOk())
                .andExpect(view().name("layout"))
                .andExpect(model().attribute("result", is(21L)));
    }
}
