package Companyquestions;
import java.util.*;
public class prime_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(int i=1;i<=a/2;i++) {
	if(a%i==0) {
		System.out.println(i);
	}
}
	}

}
