import java.util.*;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the car name");
int a=s.nextInt();
Toyota1 d=new Toyota1();
d.name();
d.about();
d.speed(a);

	}

}
 class car1{
	void name() {
		System.out.println("Toyota");
	}
	
}
class Toyota1 extends car1{
	void about() {
		System.out.println("2020 model");
		
	}
	void speed(int a) {
	
		System.out.println(a);
	}
}
