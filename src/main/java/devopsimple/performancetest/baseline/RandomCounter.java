package devopsimple.performancetest.baseline;

import java.util.Random;

public class RandomCounter {

  public long countUntilRandomNumber() {
    long randomUpperBound = new Random().nextLong(30000000000L);

    return count(randomUpperBound);
  }

  private static long count(long number) {
    long counter = 0;
    while (counter < number)
      counter++;
    return counter;
  }
}
