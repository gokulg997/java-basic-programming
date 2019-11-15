import java.util.*;
public class Audi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
	System.out.println("Enter the car name");
	String a=s.next();
	System.out.println("Enter the model name");
	String b=s.next();
	System.out.println("Enter the price");
	String c=s.next();
	chase d=new chase();
	d.name(a);
	d.model(b);
	d.price(c);
	
		}
	}
class vehicle{
	void name(String a) {
		System.out.println(a);
	}
}
class Model extends vehicle{
	void model(String b) {
		System.out.println(b);
	}
}
class chase extends  Model
{
	void price(String c) {
		System.out.println(c);
		
	}
}
