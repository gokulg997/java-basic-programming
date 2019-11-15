package Companyquestions;
import java.util.*;
public class add_2_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the matrix");
int n=s.nextInt();
int a[][]=new int[n][n];
int b[][]=new int[n][n];
int sum[][] =new int[n][n];
System.out.println("enter 1st matrix");
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		a[i][j]=s.nextInt();
	}
}
System.out.println("enter 2nd matrix");
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		b[i][j]=s.nextInt();
	}
}
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		sum[i][j]=a[i][j]+b[i][j];
		
	}
}
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		System.out.print(sum[i][j]+" ");
		}
	System.out.println();
	}


	}

}
