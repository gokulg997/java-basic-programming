package Controllstructure;
import java.util.Scanner;
public class Forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.printf("enter the number");
int a=s.nextInt();
int b=0;
int c=1;
int m=0;
		for(int i=0;i<9;i++) {
			int d=c+b;
			b=c;
			c=d;
			if (a==d) {
				m++;
				System.out.printf("yes");}
				if (m!=0);
				}
				System.out.printf("no");}
			
			
	

}
