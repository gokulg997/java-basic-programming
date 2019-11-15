package Interface;
import java.util.*;
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the name");
String a=s.next();
System.out.println("Enter the id number");
int b=s.nextInt();
System.out.println("Total score");
int c=s.nextInt();
Student st=new Student();
st.details(a,b);
st.total(c);

	}

}
interface rank {
	public void details(String a,int b) ;
		
	}

interface total{
	public void total(int c); 
		
	}

class Student implements rank,total{
	public void details(String a,int b) {
		System.out.println(" name"+a);
		System.out.println("Student id"+b);
		
	}
	public void total(int c) {
		
		System.out.println("Total"+c);
	}
}