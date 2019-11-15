package polymorphism;
import java.util.*;
public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Add a=new Add();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
a.add(b);
a.add(b,c);
a.add(b,c,d);

	}

}
