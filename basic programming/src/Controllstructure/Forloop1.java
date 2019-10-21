package Controllstructure;

public class Forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1;
System.out.printf("%d %d",a,b);
		for(int i=0;i<9;i++) {
			int c=a+b;
			System.out.printf(" %d",c);
			a=b;
			b=c;
			
		}
	}

}
