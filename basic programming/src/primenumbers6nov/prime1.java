package primenumbers6nov;
import java.util.*;
public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n=s.nextInt();
int m=s.nextInt();
int flag = 0;
//int c=0;
for(int i=n;i<m;i++) {
	if(a%i==0) {
		flag=0;
		 //c++;
	}
	else {
		flag=1;}
}
if(flag==1) {
	System.out.println("prime number");
}
else {
	System.out.println("not a prime number");
}
	}

}
