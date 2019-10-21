package Controllstructure;
import java.io.*;
public class Armstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number");
int a=Integer.parseInt(br.readLine());
int r;
int b=a;
int c=a;
int count=0;
double sum=0;
while(c!=0) {
	count++;
	c=c/10;
}
while(a!=0) {
	r=a%10;
	sum=sum+Math.pow(r,count);
	a=a/10;
	
	
}

	
if(b==sum) {
	System.out.println("yes");
	
}
else {
	System.out.println("no");
}
	}
}