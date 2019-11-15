package Companyquestions;
import java.util.*;
public class perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int temp=a;
double b=Math.sqrt(a);
double c=b*b;
System.out.println(b);
if(c==temp) {
System.out.println(" perfect square");
}
else {
	System.out.println("no perfect square");
}

	}

}
