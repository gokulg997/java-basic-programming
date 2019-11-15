package polymorphism;
import java.util.*;

public class fresh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Calorie c1=new Calorie();
int a=s.nextInt();
int b,b1,b2;
double d21 = 0,e1 = 0,f = 0;
switch(a) {
case 1:
	 b=s.nextInt();
	c1.ene1(d21,b);
	break;
case 2:
	b1=s.nextInt();
	c1.ener1(e1,b1);
	break;
case 3:
	 b2=s.nextInt();
	c1.energ1(f,b2);
	break;
	default:
		System.out.println("Invalid Input");
}

	}

}
