package Study;

import java.util.Scanner;

public class Pallindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("Input a string");
	   String a= s.nextLine();
	 
	    int l  = a.length();
	    int i, b,c;
	 
	    b  = 0;
	   c = ( l - 1)/2;
	 
	    for (i = b; i <=c; i++) {
	      if (a.charAt(b) == a.charAt(l-1)) {
	        b++;
	        c--;
	      }
	      else
	        break;
	    }
	    if (i == c + 1)
	      System.out.println("Palindrome");
	    else
	      System.out.println("Not a palindrome");
	  

	}

}
