import java.util.Scanner;

public class Emp{
	public static void main(String[] args){
		int   age, salary, phnum;
		String name,address;
		Scanner inp=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
	
		System.out.println("enter officer name");
		name=s.nextLine();
		System.out.println("enter officer age");
		age=inp.nextInt();
		System.out.println("enter officer salary");
		salary=inp.nextInt();
		System.out.println("enter officer address");
		address=s.nextLine();
		System.out.println("enter officer phno;");
		phnum=inp.nextInt();
		Officer o=new Officer(name,age,salary,address,phnum);
		o.entSpec();
		
		
		
		System.out.println("enter manager name");
		name=s.nextLine();
		System.out.println("enter manager age");
		age=inp.nextInt();
		System.out.println("enter manager salary");
		salary=inp.nextInt();
		System.out.println("enter manager address");
		address=s.nextLine();
		
		System.out.println("enter manager phno:");
		phnum=inp.nextInt();
		
		Manager m=new Manager(name,age,salary,address,phnum);
		m.entDept();
		
		o.details();
		m.details();
	} 
}

class Employee{
	int ag,phno;
	 int sal;
	String nam,add;
	
	
	void printSalary(){
	System.out.println("salary is:"+sal);
	}

}
class Officer extends Employee{
	String spc;
	Scanner s=new Scanner(System.in);
	Officer(String name,int age,int salary,String address,int phnum){
		nam=name;
		ag=age;
		sal=salary;
		add=address;
		phno=phnum;
	}
	void entSpec(){
		System.out.println("enter specialisation:");
		spc=s.nextLine();
	}
	void details(){
		System.out.println("\n\n\nprinting officer details:");
		System.out.println(nam+"\nThe age is "+ag+"\nThe salary is "+sal+"\nThe address -> "+add+"\nThe Phone number is "+phno+"\nSpecialisation in "+spc);
	
	}
}
class Manager extends Employee{
	String dept;
	Scanner s=new Scanner(System.in);
	Manager(String name,int age,int salary,String address,int phnum){
		nam=name;
		ag=age;
		sal=salary;
		add=address;
		phno=phnum;
	}
	
	void entDept(){
		System.out.println("enter Department:");
		dept=s.nextLine();
	}
	void details(){
		System.out.println("\nprinting manager details:");
		System.out.println(nam+"\nAge is "+ag+"\nThe Salary is "+sal+"\nThe address -> "+add+"\nThe phone number is "+phno+"\nFrom "+dept+" Department\n");
	
	}
}
