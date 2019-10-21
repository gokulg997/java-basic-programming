package Descionmaking;
import java.util.Scanner;
public class Example2ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.printf("enter the mark");
int a=s.nextInt();
if (a<20) {
	System.out.printf("tholvi");
}
else if (a<=40){
	System.out.printf("pling");
}
else if (a>40&&a<=60) {
	System.out.printf("middle benchers");
}
else {
	System.out.printf("al padippies");
}
	}

}
