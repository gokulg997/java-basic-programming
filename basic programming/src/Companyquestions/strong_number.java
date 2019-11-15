package Companyquestions;
import java.util.*;
public class strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	       System.out.println("Enter the number:");
	       int n=s.nextInt();
	       int fact=0,a,i,sum=0;
	       while(n>0)
	       {
	      a=n%10;
	      for(i=0;i<a;i++)
	      {
	      fact=fact*n;
	       }
	       sum=sum+fact;
	       n=n/10;
	}

	if(sum==n)
	{
	System.out.println("Strong number");
	}
	else
	{
	System.out.println("not Strong number");
	}

	}

}
