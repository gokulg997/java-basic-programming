package Basics;
import java.util.*;
public class inheritanceasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		    System.out.println("Name");
		String name=s.next();
		System.out.println("Age");
		int age=s.nextInt();
		System.out.println("Gender");
		char gender=s.next().charAt(0);
		System.out.println("ID Number");
		long id=s.nextLong();
		System.out.println("Major");
		String major=s.next();
		System.out.println("CGPA");
		double cgpa=s.nextDouble();
		System.out.println("Year");
		int year=s.nextInt();
		   CollegeStudent st=new CollegeStudent();
		    st.details();
		    st.display1(name,age,gender,id,major,cgpa,year);
		  }
		}
		class Student{
		  void details(){
		  System.out.println("Name");
		System.out.println("Age");
		System.out.println("Gender");
		System.out.println("ID Number");
		System.out.println("Major");
		System.out.println("CGPA");
		System.out.println("Year");
		}

		
			
		}
		
		
		class CollegeStudent extends Student
		{
		 // void display(String name,int age,char gender,long id,double cgpa,int year){
			public void display1(String name, int age, char gender, long id, String major, double cgpa, int year) {
				// TODO Auto-generated method stub
				 System.out.println("The Student details is");
	             System.out.println("ID :"+id);
	   System.out.println("Name :"+name);
	    System.out.println("Gender :"+gender);
	   System.out.println("Age :"+age);
	    System.out.println("Major :"+major);
	    System.out.println("CGPA :"+cgpa);
	    System.out.println("Year :"+year);
	               
	}}


