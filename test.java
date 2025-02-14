import java.util.Scanner;

class test {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    String name = myObj.nextLine();  // Read the name

    int age = myObj.nextInt();  // Read the age
    double salary = myObj.nextDouble();  // Read the salary

    // Output the data
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}

