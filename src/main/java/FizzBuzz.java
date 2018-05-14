import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public List<String> genererListe(int longueur) {
    List<String> list = new ArrayList<String>();
    for (int i = 1; i <= longueur; i++) {

      list.add(String.valueOf(i));

    }
    return list;
  }

}
