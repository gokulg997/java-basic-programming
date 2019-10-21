package Descionmaking;
import java.util.Scanner;
public class Examples1nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.printf("enter the brand name");
String brand=s.nextLine();
System.out.printf("enter the ram memory");
int ram=s.nextInt();
System.out.printf("enter the hdd size in tb");
int a=s.nextInt();
if(brand.equals("HP"))
{
	if(ram==16)
	{
		if(a==3)
		{
			System.out.printf("AVAILABLE");
		}
		else 
		{
			System.out.printf("not available"); 
		}
	}
}
else
{
	System.out.println("brand not available");
}
	}

}
