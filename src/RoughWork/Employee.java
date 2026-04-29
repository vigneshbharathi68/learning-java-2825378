package RoughWork;
public class Employee {
  String name;
  int age;
  String jobTitle;
  int salary;
  String location;

  
  Employee (String name, int age, String jobTitle, int salary, String location) {
    this.name = name;
    this.age = age;
    this.jobTitle = jobTitle;
    this.salary = salary;
    this.location = location;
  }

  void raiseSalary() {
    this.salary += 5000;
  }

  void raiseSalary(int amount) {
    this.salary += amount;
  }

  void displaySalary() {
    System.out.println(this.name + " earns $" + this.salary + " per year.");
  }
}
