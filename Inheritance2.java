import java.util.Scanner;

class Employee

{

String name;

int age;

int phonenumber;

String address;

long salary;


void getdetails(Scanner sc)

{

System.out.println("Enter the name :");

name=sc.next();

System.out.println("Enter the age :");

age=sc.nextInt();

System.out.println("Enter the phone number:");

phonenumber=sc.nextInt();

System.out.println("Enter the address :");

address=sc.next();

System.out.println("Enter the salary :");

salary=sc.nextLong();

}

void printdetails()

{

System.out.println("name :"+name);

System.out.println("age :"+age);

System.out.println("phonenumber:"+phonenumber);

System.out.println("address:"+address);

}


void print_salary()

{

System.out.println("Salary is "+salary);

}

}

class Officer extends Employee

{

String specilization;

public void netSpecilization(Scanner sc)

{

System.out.println("Enter the Specilization : ");

specilization=sc.next();

}

public void printSpecilization()

{

System.out.println("Specilization : " +specilization);


}

}

class Manager extends Employee

{

String Department;

public void netDepartment(Scanner sc)

{

System.out.println("Enter the department");

Department=sc.next();

}

public void printDepartment()

{

System.out.println(" Department : " +Department);


}

}

public class Inheritance2 {


public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

Officer officer=new Officer();

System.out.println("Enter the officer details");

officer.getdetails(sc);

officer.netSpecilization(sc);

System.out.println(" officer details : ");

officer.printdetails();

officer.print_salary();

officer.printSpecilization();

Manager manager =new Manager();

System.out.println("Enter the Manager details ");

manager.getdetails(sc);

manager.netDepartment(sc);

System.out.println(" Manager details :");

manager.printdetails();

manager.print_salary();

manager.printDepartment();


}

}