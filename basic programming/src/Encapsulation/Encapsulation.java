package Encapsulation;
import java.util.*;
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
book b =new book();
display d=new display();
System.out.println("Registration");
System.out.println("Enter the name");
b.setName(s.next());
System.out.println("Enter the address");
b.setAddress(s.next());
System.out.println("Enter the Contact Number");
b.setContactNumber(s.next());
System.out.println("Enter the email");
b.setEmail(s.next());
System.out.println("Enter the proof type");
b.setProoftype(s.next());
System.out.println("Enter the proofid");
b.setProofid(s.next());
d.disp(b.getName(),b.getAddress(),b.getContactNumber(),b.getEmail(),b.getProoftype(),b.getProofid());


	}

}
