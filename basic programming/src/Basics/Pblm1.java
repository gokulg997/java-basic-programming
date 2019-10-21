package Basics;
import java.util.Scanner;
public class Pblm1 {

	public static void main(java.lang.String[] args) {
	Scanner s=new Scanner(System.in);
	char a=s.next().charAt(0);
	int n=s.nextInt();
	s.nextLine();
	String b=s.nextLine();
	int g=s.nextInt();
	System.out.printf("%-15s,%03d\n",a,n);
	System.out.printf("%-15s,%03d\n",b,g);
	}

}
