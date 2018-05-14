import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public List<String> generateList(int length) {
    List<String> fbList = new ArrayList<>();
    for (int n = 1; n < length + 1; n++) {
      fbList.add(transformSingleNumber(n));
    }
    return fbList;
  }
  private String transformSingleNumber(int n) {
    String s = String.valueOf(n);
    if (n % 3 == 0 && n % 5 == 0) {
      return "FizzBuzz";
    }
    if (n % 3 == 0) {
      return "Fizz";
    }
    if (n % 5 == 0) {
      return "Buzz";
    } else {
      return s;
    }
  }
}
