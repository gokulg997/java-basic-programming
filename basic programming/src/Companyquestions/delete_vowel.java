package Companyquestions;
import java.util.*;
public class delete_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next();
		//String A[]=new String[a.length()];
		//String b="";
		char c;
		int count=0;
		for(int i=0;i<a.length();i++) {
			char c1=a.charAt(i);
			
			if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='u')||(c1=='o')||(c1=='A')||(c1=='E')||(c1=='I')||(c1=='U')||(c1=='U')) {
				count++;
				System.out.print("");
			}
			else {
				System.out.print(c1);
			}
		}
	}

}
