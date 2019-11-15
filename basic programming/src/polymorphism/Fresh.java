package polymorphism;
import java.util.*;
public class Fresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("1.Bread only");
System.out.println("2.Bread+jam");
System.out.println("1.Bread+jam+butter");
System.out.println("Enter your choice");
Calory c=new Calory();
int a=s.nextInt();

switch(a) {
case 1:
	System.out.println("Enter your");
	int b=s.nextInt();
	c.ene(a);
	break;
case 2:
	System.out.println("Enter your");
	int e=s.nextInt();
	System.out.println("Enter your");
	int f=s.nextInt();
	c.ener(e,f);
	break;
case 3:
	System.out.println("Enter yourb");
	int g=s.nextInt();
	System.out.println("Enter yourj b");
	int h=s.nextInt();
	System.out.println("Enter your bu");
	int i=s.nextInt();
	c.energ(g,h,i);
	break;
	default:
		System.out.println("Invalid Input");
}
	}

}
