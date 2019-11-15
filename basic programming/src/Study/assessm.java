package Study;
import java.util.*;
public class assessm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		  int a=s.nextInt();
	  int A[]=new int[a];
	  int b[]=new int[a];
	  int c[]=new int[a];
		  for(int i=0;i<a;i++){
			  A[i]=s.nextInt();
		  }
		  for(int i=0;i<a;i++){
			  if(A[i]%2==0){
				 b[i]=A[i];}
			  else {
				  c[i]=A[i];}}
		  for(int i=0;i<a;i++){
				 System.out.println(b[i]);}
		  for(int i=0;i<a;i++){
				 System.out.println(c[i]);}
	}

}
