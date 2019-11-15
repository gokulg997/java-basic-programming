package Companyquestions;
import java.util.*;
public class fibonacci_upto_n_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();

int a = 0;
int b=1;
System.out.print(a+" ");
		System.out.print(b+" ");
int c = 0;
for(int i=0;i<=n;i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.print(c+" ");
}

	}

}
