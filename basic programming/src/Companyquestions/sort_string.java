package Companyquestions;
import java.util.*;
public class sort_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String st=s.next();
char c[]=st.toCharArray();
for(int i=0;i<c.length-1;i++) {
	for(int j=i+1;j>0;j--) {
		if(c[j]<c[j-1]) {
			char temp=c[j-1];
			c[j-i]=c[j];
			c[j]=temp;
		}
	}}

	System.out.println(c);
	}

}

