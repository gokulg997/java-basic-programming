package Companyquestions;
import java.util.*;
public class nth_fibonacci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int a = 0;
		int b=1;
		
		int c = 0;
		for(int i=0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			
		}
		System.out.print(c);

	}

}
