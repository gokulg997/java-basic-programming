package primenumbers6nov;
import java.util.*;
public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int flag=0;
int num=0;
int i;
for( i=0;i<=b;i++) {
	for (int j=a;j<=b;j++) {
		if (i/j==0) {
			//flag=0;
			num++;
		}
	}
}
if (num==0) {
	System.out.println(num);
}
	}

}
