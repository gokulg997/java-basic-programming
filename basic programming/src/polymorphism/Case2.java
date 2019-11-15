package polymorphism;
import java.util.*;
public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Bill number");
int a=s.nextInt();
System.out.println("name");
String b=s.next();
System.out.println("number of calls made");
int h=s.nextInt();
System.out.println("cost per call");
int c=s.nextInt();
System.out.println("Bill number");
int d=s.nextInt();
System.out.println("customer");
String e=s.next();
System.out.println("unit consumed");
int f=s.nextInt();
System.out.println("cost per unit");
int g=s.nextInt();
bill bi=new bill();
bi.details(a,b);
tellbill tb=new tellbill();
tb.genbill(h,c);
current cu=new current();
cu.currbill(f,g);




	}

	private static void genbill(int h, int c) {
		// TODO Auto-generated method stub
		
	}

}
