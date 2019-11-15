package Encapsulation;
import java.util.*;
public class Encapsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Customer c=new Customer();

display1 d=new display1();
do {
System.out.println("Registration");
System.out.println("Enter the name");
c.setName3(s.next());
System.out.println("Enter the address");
c.setAddress3(s.next());
System.out.println("Enter the Contact Number");
c.setContact3(s.next());
System.out.println("Enter the email");
c.setEmail3(s.next());
System.out.println("Enter the proof type");
c.setProoftype3(s.next());
System.out.println("Enter the proofid");
c.setProofid3(s.next());
if(c.getName3()==null)
{
	System.out.println("Invalid Name");
	}
if(c.getAddress3()==null)
{
	System.out.println("Invalid Address");
	}
if(c.getContact3()==null)
{
	System.out.println("Invalid contact number");
	}
if(c.getEmail3()==null)
{
	System.out.println("Invalid email");
	}
if(c.getProoftype3()==null)
{
	System.out.println("Invalid Name");
	}

d.disp1(c.getName3(),c.getAddress3(),c.getContact3(),c.getEmail3(),c.getProoftype3(),c.getProofid3());


}

}
