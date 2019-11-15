import java.util.*;

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the model name");
String a=s.next();
System.out.println("Enter the cc");
String b=s.next();
Royal r=new Royal();
bullet d=new bullet();
r.model(a);
d.cc(b);
	}

}
class Enfield{
	
}
class Royal extends Enfield{
	void model(String a) {
		System.out.println(a);
		
	}
}
class bullet extends Enfield{
	void cc(String b) {
		System.out.println(b);
		
	}
}