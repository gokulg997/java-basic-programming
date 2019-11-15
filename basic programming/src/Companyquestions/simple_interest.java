package Companyquestions;
import java.util.*;
public class simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int principle=s.nextInt();
int year=s.nextInt();
double rate=s.nextDouble();
double interest=principle*year*(rate/100);
System.out.println("interest :"+interest);
System.out.println("total :"+(principle+interest));
	}

}
