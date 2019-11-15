package fibonacci;
import java.util.*;
public class Fib1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0;
int b=1;
int c;
System.out.println(a);
System.out.println(b);
for(int i=2;i<n;i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);
}
	}

}
