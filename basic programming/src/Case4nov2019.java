import java.util.*;
public class Case4nov2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Booking");
System.out.println("Enter the number of persons");
int a=s.nextInt();
System.out.println("Enter the number of days");
int b=s.nextInt();
System.out.println("Enter the room type");
String c=s.next();
System.out.println("Enter the tariff for for single person ");
int d=s.nextInt();
Booking1 e=new Booking1();
//e.person(a);
//e.days(b);
//e.tariff(d);
e.total(a,b,d);
	}

}
class hotel{
	
}
class Booking1 extends hotel{
	
	void total(int a,int b,int d){
		double tot=a*b*d;
		System.out.println("Total Tariff"+tot);
	}
}