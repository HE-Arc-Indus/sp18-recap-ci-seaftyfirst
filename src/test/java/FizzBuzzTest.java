import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FizzBuzzTest {

  /**
   * FizzBuzz creates a list of the given length
   */
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

  /**
   * The list is a sequence of list of the given length
   */
  @org.junit.Test
  public void testFirstTwoIntegers() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays.asList("1", "2");
    // Act
    List<String> actual = fb.generateList(2);
    // Assert
    assertThat(actual, is(expected));
  }

  /**
   * Replaces 3 by Fizz
   */
  @org.junit.Test
  public void replace3ByFizz() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays.asList("1", "2", "Fizz");
    // Act
    List<String> actual = fb.generateList(expected.size());
    // Assert
    assertThat(actual, is(expected));
  }


  /**
   * Replaces 5 by Buzz
   */
  @org.junit.Test
  public void replace5ByBuzz() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
    // Act
    List<String> actual = fb.generateList(expected.size());
    // Assert
    assertThat(actual, is(expected));
  }


  /**
   * Replaces multiples of 3 and 5 by FizzBuzz
   */
  @org.junit.Test
  public void replaceMultiplesOf3And5ByBuzz() {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    List<String> expected = Arrays
        .asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
            "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz",
            "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37",
            "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49",
            "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61",
            "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73",
            "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz",
            "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97",
            "98", "Fizz", "Buzz");
    // Act
    List<String> actual = fb.generateList(expected.size());
    // Assert
    assertThat(actual, is(expected));
  }


  /**
   * Exemple d'utilisation de la réflexion pour tester la méthode privée
   * @throws NoSuchMethodException
   * @throws InvocationTargetException
   * @throws IllegalAccessException
   */
  @org.junit.Test
  public void testSingleNumberPrivateMethod()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    // Arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "FizzBuzz";
    int testValue  = 15;
    // int parameter
    Class[] argClasses = new Class<?>[1];
    argClasses[0] = int.class;
    Method m = null;
    m = fb.getClass().getDeclaredMethod("transformSingleNumber", argClasses);
    m.setAccessible(true);
    // Act
    String actual = (String) m.invoke(fb, testValue);
    assertThat(actual, is(expected));
  }
}