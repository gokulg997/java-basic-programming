package Companyquestions;

import java.util.*;

public class primenum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int cn=0,i=0;
		for (i = 2; i < a/2; i++) {
			
				if (a% i == 0) {
					cn++;
					break;
				}
				
				
				
			}
		if(cn==0)
		{
			System.out.println(i);
		}
		}
	}



