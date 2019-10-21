package Descionmaking;
import java.util.Scanner;
public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int min=(a<b)? a:b;
int max=(a<b)? b:a;
int hcf=0;
int lcm=0;
for(int i=min;i>0;i--) {
	if((a%i==0 && b%i==0)) 
	{
		hcf=i;
	break;
	}
		}
System.out.println(hcf);
for(int i=max;i<=(a*b);i++) {
	if((i%a==0&&i%b==0)) {
		lcm=i;
		break;
	}
}
System.out.println(lcm);
}
	}


