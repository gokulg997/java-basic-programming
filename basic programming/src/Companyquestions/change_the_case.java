package Companyquestions;
import java.util.*;
public class change_the_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
int b=(int)a;
if(b>64&&b<91) {
	int c=b+32;
	System.out.println((char)c);
}
else if(b>96&&b<123) {
	int d=b-32;
	System.out.println((char)d);
}
else {
	System.out.println("invalid");
}
	}

}
