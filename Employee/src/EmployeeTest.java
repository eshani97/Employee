/**
 * 
 */

/**
 * @author This
 *
 */
import java.util.*;
public class EmployeeTest
{
public static void main(String[] args)
	
{
	Employee employee1=new Employee();
	Employee employee2=new Employee();
  @SuppressWarnings("resource")
Scanner input = new Scanner(System.in);
  
  System.out.println("\nEnter First name of Employee 1");
  String emp1FirstName=input.nextLine();
  employee1.setFirstName(emp1FirstName);
  

  System.out.println("\nEnter Last name of Employee 1");
  String emp1LastName=input.nextLine();
  employee1.setLastName(emp1LastName);
  

  System.out.println("\nEnter Monthly Salary of Employee 1");
  double emp1MonthlySalary=input.nextDouble();
  employee1.setMonthlySalary(emp1MonthlySalary);
  

  System.out.println("\nEnter First name of Employee 2");
  String emp2FirstName= input.nextLine();
  employee2.setFirstName(emp2FirstName);
  

  System.out.println("\nEnter Last name of Employee 2");
  String emp2LastName= input.nextLine();
  employee2.setLastName(emp2LastName);
  

  System.out.println("\nEnter Monthly Salary of Employee 2");
  double emp2MonthlySalary=input.nextDouble();
  employee2.setMonthlySalary(emp2MonthlySalary);
  
  //CALCULATING YEARLY SALARY
  double emp1Yearly=employee1.yearlySalary();
  double emp2Yearly=employee2.yearlySalary();
  
  System.out.printf("%s %s's Yearly Salary is %f%n",employee1.getFirstName(),employee1.getLastName(),emp1Yearly);
  System.out.printf("%s %s's Yearly Salary is %f%n",employee2.getFirstName(),employee2.getLastName(),emp2Yearly);
  
  //CALCULATING SALARY AFTER RAISE
  double emp1RaiseSalary=employee1.raiseSalary();
  double emp2RaiseSalary=employee2.raiseSalary();
  
  System.out.printf("%s %s's Revised and Raised Yearly Salary is %f%n",employee1.getFirstName(),employee1.getLastName(),emp1RaiseSalary);
  System.out.printf("%s %s's Revised and Raised Yearly Salary is %f",employee2.getFirstName(),employee2.getLastName(),emp2RaiseSalary);
}
}
