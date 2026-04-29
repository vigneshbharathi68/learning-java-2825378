import Inheritance.ModArrayList;
import Inheritance.SalesPerson;

public class Main {
  public static void main (String[] args) {
    // Tree myFavoriteOakTree = new Tree(120, 12, TreeType.OAK);

    // Tree myFavoritePineTree = new Tree(80, 8, TreeType.PINE);

    // myFavoriteOakTree.announceTallTree();
    // myFavoritePineTree.announceTallTree();

    // System.out.println(Tree.getTRUNK_COLOR());

    // Employee employee1 = new Employee("Alice", 30, "Software Engineer", 100000, "New York");
    // Employee employee2 = new Employee("Bob", 25, "Data Scientist", 90000, "San Francisco");

    // employee1.raiseSalary(6000);

    // employee1.displaySalary();
    // employee2.displaySalary(); 

    // String name = "Vignesh";

    // System.out.println(name.length());

    // BankAccount account1 = new BankAccount("Vignesh", 5000);
    // account1.deposit(2000);
    // account1.withdraw(1000);


    // SalesPerson salesPerson1 = new SalesPerson("Alice", 50000, 30, 0.10);
    // System.out.println(salesPerson1.getAnnualBonus());

    ModArrayList<Integer> modList = new ModArrayList<>();
    modList.add(0);
    modList.add(10);
    modList.add(20);
    modList.add(30);
    System.out.println(modList.getUsingMod(1)); // Output: 10
    System.out.println(modList.getUsingMod(-2)); // Output: 20
    System.out.println(modList.getUsingMod(40)); // Output: 30



  }
}