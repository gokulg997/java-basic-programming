package Descionmaking;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int f=1,c=0;
int num=n,r;
while(n!=0) {
	r=n%10;
	f=1;
	for(int i=1;i<=r;i++) {
		f=f*i;
	}
	c=c+f;
	n=n/10;
}
if(c==num) {
	System.out.println("strong number");
}
else {
	System.out.println("not strong number");
}
	}

}
