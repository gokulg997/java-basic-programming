package Companyquestions;
import java.util.*;
public class binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int bi=s.nextInt();
		int i = 0,d=0,r;
		while(bi!=0)
		{
		r=bi%10;
		d=d+(int)(r*Math.pow(2,i));
		bi=bi/10;
		i++;
		}
		System.out.println(d);


	}

}
