package Study;

import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner s=new Scanner(System.in);
	  int i=0;
	String A[]=new String[5];
	  for( i=0;i<=5;i++){
		  A[i]=s.next();
	  Arrays.sort(A);
	  System.out.println(A[i]);}
  }
}