
package Companyquestions;
import java.util.*;
public class prime_num_within_a_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int h=s.nextInt();
for(int i=l;i<h;i++) {
	int c=0;
	for(int j=2;j<h;j++) {
		if(i%j==0) {
			c++;
		}
	}

	
if(c==1) {
	System.out.println(i);
	
}}
	}

}
