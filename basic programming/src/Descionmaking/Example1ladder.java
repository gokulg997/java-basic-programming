package Descionmaking;
import java.util.Scanner;
public class Example1ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.printf("enter the age");
int a=s.nextInt();
if (a<18) {
	System.out.printf("child");
}
else if (a<=30){
	System.out.printf("young");
}
else if (a>30&&a<=60) {
	System.out.printf("middle aged");
}
else {
	System.out.printf("old");
}
	}

}
