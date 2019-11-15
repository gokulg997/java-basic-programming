package polymorphism;
import java.util.*;
public class case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
 Details d=new Details();
 vehicle c=new vehicle();
 bullet b=new bullet();
 System.out.println("1)car");
 System.out.println("2)bike");
  int a=s.nextInt();
  
 switch(a) {
 case 1:
	 System.out.println("Enter the details of car");
	 System.out.println("Enter the colour");
	 String color1=s.next();
	 System.out.println("Enter the max. speed");
	 int speed1=s.nextInt();
	 System.out.println("Enter the max. no of seats");
	 int seats1=s.nextInt();
	 System.out.println("Enter the no of wheels");
	 int wheels1=s.nextInt();
	 
	 System.out.println("Enter the status of Ac(true/false)");
	 String option1=s.next();
	 c.details(color1,speed1,seats1,wheels1,option1);
	 break;
	 case 2:
	 System.out.println("Enter the details of bike");
	 System.out.println("Enter the colour");
	 String color2=s.next();
	 System.out.println("Enter the max. speed");
	 int speed2=s.nextInt();
	 System.out.println("Enter the max. no of seats");
	 int seats2=s.nextInt();
	 System.out.println("Enter the no of wheels");
	 int wheels2=s.nextInt();
	 
	 System.out.println("Enter the status of discbreak(true/false)");
	 String option2=s.next();
	 b.details(color2,speed2,seats2,wheels2,option2);
	 break;
	 default:
	 System.out.println("Invalid option");
	 break;
	 }

	 }

	 }

