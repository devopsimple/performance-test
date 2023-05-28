package devopsimple.acceptance;

import devopsimple.springboot.PerformanceTestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.matchesRegex;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(classes = PerformanceTestApplication.class)
@AutoConfigureMockMvc
class PerformanceTestApplicationTests {

  @Autowired
  MockMvc mvc;

  @Test
  void count_until_random_number() throws Exception {
    mvc.perform(get("/random-counter"))
      .andExpect(content().string(matchesRegex("\\d+")));
  }

}
