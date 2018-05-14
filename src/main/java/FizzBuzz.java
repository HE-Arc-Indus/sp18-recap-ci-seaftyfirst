/*
 * Company : HEG-ARC
 * Lesson: ODI SP18
 * Project: sp18-recap-ci-seaftyfirst
 * Autor: odile
 * Date: 10.05.18 10:57
 * Module: sp18-recap-ci-seaftyfirst
 * Last mofified : 09.05.18 09:49
 *
 */

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
