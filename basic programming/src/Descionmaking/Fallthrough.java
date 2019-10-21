package Descionmaking;
import java.util.Scanner;
public class Fallthrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System .out.printf("enter the number");
int n=s.nextInt();
switch(n) {
case 1:
case 2:
case 5:
	case 7:
	case 9:
		System.out.printf("31 days");
		break;
	case 6:
	case 8:
	case 10:
		System.out.printf("30 days");
		break;

}
	}

}
