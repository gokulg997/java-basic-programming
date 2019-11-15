package Companyquestions;
import java.util.*;

public class max_elementr_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int max=0;
int a[]=new int[n];
for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
}
for(int i=0;i<n;i
		++) {
	if(a[i]>max) {
		max=a[i];
	}
}
System.out.println(max);
	}

}
