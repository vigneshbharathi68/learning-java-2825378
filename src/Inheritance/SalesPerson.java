package Inheritance;

public class SalesPerson extends Employee {
  
  private double commissionPercentage;

  public SalesPerson(String name, double salary, int age, double commissionPercentage) {
    super(name, salary, age);
    this.commissionPercentage = commissionPercentage;
  }
  public double getCommissionPercentage() {
    return commissionPercentage;
  }

  public void setCommissionPercentage(double commissionPercentage) {
    this.commissionPercentage = commissionPercentage;
  }

  

}
