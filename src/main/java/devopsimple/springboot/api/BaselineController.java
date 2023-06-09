package devopsimple.springboot.api;

import devopsimple.performancetest.baseline.RandomCounter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BaselineController {

  private final RandomCounter randomCounter;

  @GetMapping("/random-counter")
  long count(){
    return randomCounter.countUntilRandomNumber();
  }
}
