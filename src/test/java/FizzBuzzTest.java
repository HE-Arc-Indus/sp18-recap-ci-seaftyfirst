import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void testGenererList() {
    //ARrange
    fizzBuzz.genererListe(3);
    List<String> expected = Arrays.asList("1", "2", "3");
    //Act
    List<String> method = fizzBuzz.genererListe(3);
    //ASsert
    assertThat(method.size(), is(method.size()));

  }
}