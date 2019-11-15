package Companyquestions;
import java.util.*;
public class consonent_or_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
char c1=s.next().charAt(0);
if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='u')||(c1=='o')||(c1=='A')||(c1=='E')||(c1=='I')||(c1=='U')||(c1=='U')) {
	System.out.println("vowel");
	}
else {
	System.out.println("Consonent");
}
}

}
