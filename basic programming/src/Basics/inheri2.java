package Basics;
import java.util.*;
public class inheri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    String bike=s.next();
	    String colour=s.next();
	    float cc=s.nextFloat();
	    int speed=s.nextInt();
	    Double price=s.nextDouble();
	    double discount=s.nextDouble();
	    String bike1=s.next();
	    String colour1=s.next();
	    float cc1=s.nextFloat();
	    int speed1=s.nextInt();
	    Double price1=s.nextDouble();
	    double discount1=s.nextDouble();
	    bike bi=new bike();
	    Scooter sc=new Scooter();
	   
	    bi.details(bike,colour,cc,speed,price,discount);
	    sc.details(bike1,colour1,cc1,speed1,price1,discount1);
	 
	}

}
class vehicle{
	
	
}