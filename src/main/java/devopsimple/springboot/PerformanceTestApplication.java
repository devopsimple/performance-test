package devopsimple.springboot;

import devopsimple.performancetest.baseline.RandomCounter;
import devopsimple.springboot.api.BaselineController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaselineController.class, RandomCounter.class})
public class PerformanceTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(PerformanceTestApplication.class, args);
  }

}
