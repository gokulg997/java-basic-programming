package Companyquestions;
import java.util.*;
public class sum_of_all_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int h=s.nextInt();
		int sum = 0;
		for(int i=l;i<h;i++) {
			int c=0;
			
			for(int j=2;j<h;j++) {
				
				if(i%j==0) {
					sum = i+i;
					c++;
				}
			}
			
		}
		System.out.println(sum);


	}

}
