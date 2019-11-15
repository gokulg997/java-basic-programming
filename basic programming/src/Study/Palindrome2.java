package Study;
import java.util.*;
public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a=s.next();
String t=a;
int l=t.length();
String rev="";
for(int i=l-1;i>=0;i--) {
	rev=rev+t.charAt(i);
}
if (t.equals(rev)) {
	System.out.println("Pallindrome");
}
else {
	System.out.println("not a palindrome");
}
	}

}
