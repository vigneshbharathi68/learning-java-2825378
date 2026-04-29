package StreamsAPI;

import java.util.ArrayList;
import java.util.List;

public class ExamplesCollection {
  public static void main (String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Vignesh");
    names.add("Bharathi");
    names.add("Ramesh");
    names.remove(1);

    System.out.println(names);
  }
}
