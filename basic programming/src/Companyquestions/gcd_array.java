package Companyquestions;
import java.util.*;
public class gcd_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int A[]=new int[a];
int gcd=0,i=0,j=0;
for( i=0;i<a;i++) {
	A[i]=s.nextInt();}
	for( j=1;j<A[i];j++) {
		if(A[i]%j==0) {
			gcd=j;
		}
		System.out.println(gcd);
	}
}
	}


