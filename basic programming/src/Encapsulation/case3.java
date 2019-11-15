package Encapsulation;
import java.util.*;
public class case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		booking b=new booking();
		int a=0,i=0,c=0;
	System.out.println("enter the price of a ticket");
	b.setPrice(s.nextInt());
	System.out.println("enter the no. of person");
	b.setPer(s.nextInt());
	do {
	
	System.out.printf("Enter Details Of Person %d\n",i);i++;
	System.out.println("Enter name");
	b.setName(s.next());
	
	System.out.println("Enter gender(F/M)");
	b.setG(s.next());
	System.out.println("Enter age");
	b.setAge(s.nextInt());
	a--;
	}while(a>0);
	b.book(b.getPer(),b.getPrice());
	while(c<=b.getPer())
	{
	double total=b.ticket( b.getAge(),b.getG(),b.getPer(),b.getPrice());
	if(c==b.getPer()) {
	System.out.printf("Total Amount=%.1f",total);
	break;
	}
	c++;
	}
	}

}
