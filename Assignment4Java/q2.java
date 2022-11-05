package MISC.Assignment4Java;

public class q2 {

  public static void main(String[] args) {

    // Create 3 objects of class Employee
    Employee E1 = new Employee("Robert", 1994, "64C- WallsStreat");
    Employee E2 = new Employee("Sam", 2000, "68D- WallsStreat");
    Employee E3 = new Employee("John", 1999, "26B- WallsStreat");
    System.out.println("Name " + "Year of joining " + "Address");
    E1.printDetails();
    E2.printDetails();
    E3.printDetails();
  }
}

class Employee {
  // Creating instance variables
  String empName;
  int joiningYear;
  String address;

  // Creating a constructor for intializing the variables
  Employee(String Employee_name, int year_of_joining, String address) {
    this.empName = Employee_name;
    this.joiningYear = year_of_joining;
    this.address = address;
  }

  // create a method for printing employee details
  void printDetails() {
    System.out.println(this.empName + " " + this.joiningYear + " " + this.address);
  }

}
