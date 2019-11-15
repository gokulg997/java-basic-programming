package Interface;
import java.util.*;
public class case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Registra");
		
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the address");
		String address=s.next();
		System.out.println("Enter the contact number");
		int contact=s.nextInt();
		System.out.println("Enter the Email");
		String mail=s.next();
		System.out.println("Enter proof type");
		String pt=s.next();
 System.out.println("Enter the proof id");
		String pi=s.next();
		System.out.println("Thank you for registering.Your id is 1");
		System.out.println("Do you want to continue registration (y/n)?");
		String op=s.next();
		System.out.println("Do you want to update the email id?(yes/no)");
		String op1=s.next();
		if(op1.contentEquals("yes")){
	    System.out.println("Update Email:");
	    System.out.println("Enter new Email id");
	    String n=s.next();}
		else {
			System.exit(0);
		System.out.println("Email updated");
		Register1 rr=new Register1().
		rr.reg(name,address,contact,mail,pt,pi);
		rr.reg1(n);
		
	}

}

class Register1 implements re,reg1{
	
	public static Object rr;

	public void reg(String name,String address,int contact,String mail,String pt,String pi ) {
		System.out.println("Your details are as follows");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact:"+contact);
		System.out.println("EMail:"+mail);
		System.out.println("Proof type:"+pt);
		System.out.println("Proofid:"+pi);
}
	
}}