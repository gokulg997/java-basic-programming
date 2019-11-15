package polymorphism;
import java.util.*;
public class poly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Booking b=new Booking();
System.out.println("Enter your name");
String a=s.next();
System.out.println("address");
String c=s.next();
System.out.println("contact");
String d=s.next();
System.out.println("from");
String e=s.next();
System.out.println("to");
String f=s.next();
System.out.println("tariff for one person");
int g=s.nextInt();
System.out.println("no of person");
int h=s.nextInt();
b.details(a,c,d,e,f);
b.total(g,h);

	}

}
