package Descionmaking;
import java.util.Scanner;
public class Vowelsstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int a=s.nextInt();
String b[]=new String[a];
System.out.println("enter elements");
for(int i=0;i<a;i++)
{
	b[i]=s.next();
}
char c;
for(int i=0;i<a;i++)
{
	c=b[i].charAt(0);
	
	if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
	System.out.println(b[i]);
	}
}
}
	}


