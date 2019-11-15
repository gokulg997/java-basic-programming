package operator;
import java.util.*;
class Carnew
{
String str;
public Carnew(String str)
{
str=str;
}
public static void m()
{
System.out.println("WELCOME CAR M");
System.out.println("WELCOME CAR MODEL 123");
}
public static void b()
{
System.out.println("WELCOME CAR B");
System.out.println("WELCOME CAR MODEL 124");


}
public static void a()
{
System.out.println("WELCOME CAR A");
System.out.println("WELCOME CAR MODEL 125");


}
public static void display(String str)
{
System.out.println(str);
}
}
public class OOPs {
 public static void main(String args[])
 {
Scanner s=new Scanner(System.in);
System.out.println("ENTER A STRING");
String str=s.nextLine();
Carnew ca=new Carnew(str);
Carnew.m();
Carnew.b();
Carnew.a();
Carnew.display(str);
s.close();

 }




	
		// TODO Auto-generated method stub

	}


