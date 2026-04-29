package Inheritance;

import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<Integer> {

  public ModArrayList() {
    super();
  }

  public int getUsingMod(int index) {
    int validIndex = Math.abs(index) % this.size();
    System.out.println("Accessing size: " + this.size() + ", valid index: " + validIndex);
    return this.get(validIndex);
  }
  
}
