package Encapsulation;
import java.util.*;
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Student c=new Student();
System.out.println("Enter the name");
c.setName(s.next());
System.out.println("Enter the Id");
c.setId(s.nextInt());
System.out.println("Name: "+c.getName());
		 System.out.println("Id: "+c.getId());

	}

}
