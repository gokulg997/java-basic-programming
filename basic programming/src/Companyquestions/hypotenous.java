package Companyquestions;
import java.util.*;
public class hypotenous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int base=s.nextInt();
int altitude=s.nextInt();
double hypo1=(base*base)+(altitude*altitude);
double hypo2=Math.sqrt(hypo1);
System.out.println(hypo2);
	}

}
