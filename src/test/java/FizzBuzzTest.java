import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FizzBuzzTest {
  
  @Test
  public void testListSize() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays.asList(null, null, null);
    // Act
    List<String> actual = fb.generateList(3);
    // Assert
    assertThat(actual.size(), is(expected.size()));
  }


  @org.junit.Test
  public void testWithTwoIntegers() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays.asList("1", "2");
    // Act
    List<String> actual = fb.generateList(2);
    // Assert
    assertThat(actual, is(expected));
  }


  @org.junit.Test
  public void testReplace3byFizz() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays.asList("1", "2", "Fizz");
    // Act
    List<String> actual = fb.generateList(expected.size());
    // Assert
    assertThat(actual, is(expected));
  }



  @org.junit.Test
  public void testReplace5byBuzz() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
    // Act
    List<String> actual = fb.generateList(expected.size());
    // Assert
    assertThat(actual, is(expected));
  }



  @org.junit.Test
  public void fizzBuzz3and5() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays
        .asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
            "14", "FizzBuzz");
    // Act
    List<String> actual = fb.generateList(expected.size());
    // Assert
    assertThat(actual, is(expected));
  }



}