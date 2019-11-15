package fibonacci;
import java.util.*;
public class fib2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int a=0;
int b=1;
int c=0;
for(int i=2;i<n;i++) {
	c=a+b;
	a=b;
	b=c;}
if (c==m) {
	System.out.println("its a fibonacci number");}
else {
	System.out.println("its not a fibonacci number");
}
}
	}


