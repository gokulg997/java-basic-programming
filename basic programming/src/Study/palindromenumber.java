package Study;

import java.util.Scanner;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int  a=s.nextInt();
		int t=a;
		int l=t.length();
		int  rev;
		for(int i=l-1;i>=0;i--) {
			rev=rev+i;
		}
		if (t.reverse(rev)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
