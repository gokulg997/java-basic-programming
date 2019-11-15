import java.util.Scanner;
public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a=s.next();
Oppo c=new Oppo();
c.features();
c.display();
c.model(a);

	}

}
 class  realme{
	void features(){
		
			System.out.println("500 mAh Battery");		
	}
		void display() {
			System.out.println("LED crystal display");
			}
		
 }
 class Oppo extends realme {
	 void model(String a) {
			System.out.println(a);
				}
 }
