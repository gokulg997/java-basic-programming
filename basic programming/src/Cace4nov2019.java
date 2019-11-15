import java.util.*;
public class Cace4nov2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of persons");
int a=s.nextInt();
System.out.println("Enter the number of days");
int  b=s.nextInt();
System.out.println("Enter the room type");
String c=s.next();
System.out.println("Enter the month");
int d=s.nextInt();
System.out.println("Enter the tariff amount for one person");
int g=s.nextInt();
if(d==4||d==6||d==9||d==11||d==12) {
	System.out.println("Enter the peak charge");
	int e=s.nextInt();
	peakseason h=new peakseason();
	h.peak(a,b,g,e);
}
else {
if(d==1||d==2||d==3||d==7||d==5||d==8||d==10){
	System.out.println("Enter the discount");
	int d1=s.nextInt();
	leanseason i=new leanseason();
	i.lean(a,b,g,d1);
}}

	}

}
class hotel1{
	
	}

class peakseason extends hotel1{
	void peak(int a,int b,int e,int g) {
		int tot=(g*a*b);
		tot=tot+e;
		System.out.println("Total tariff:"+tot);
	}
}
class leanseason extends hotel1{
	void lean(int a,int b,int d1,int g) {
		double tot1=(a*b*g)-d1;
	System.out.println("Total tariff:"+tot1);
	}

	
}