package Companyquestions;
import java.util.*;
public class decimal_to_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		int r,o=0,i=1;
		while(d!=0)
		{
		r=d%8;
		o=o+r*i;
		d=d/8;
		i=i*10;
		}
		System.out.println(o);

	}

}
