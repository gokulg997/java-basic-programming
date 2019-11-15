package Study;
import java.util.*;
public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int A[]=new int[a];
for(int i=0;i<a;i++) {
	A[i]=s.nextInt();
}
Arrays.sort(A);
System.out.println(A[a-2]);

	}

}
