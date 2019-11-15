package Study;
import java.util.*;
public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=1;
		for (int i = 2; i * i <= n; i++) 
	    { 
	        if (n % i==0) 
	        { 
	            if(i * i != n) 
	                sum = sum + i + n / i; 
	            else
	                sum = sum + i; 
	        } 
	    }  
	    
	    if (sum == n && n != 1) {
	        System.out.println("perfect number");
	    }
	    else {
	    	System.out.println("not a perfect number");
	    }
	    	
	  
	    
	}

}
