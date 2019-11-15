package Companyquestions;
import java.util.*;
public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int year=s.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("century leap year");
				}
				else {
					System.out.println("not century leap year");
				}
				System.out.println("century  year");
			}
			else{
				System.out.println("not century year");
			}
			System.out.println("normal leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
