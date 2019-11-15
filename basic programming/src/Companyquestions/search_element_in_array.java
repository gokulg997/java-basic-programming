package Companyquestions;
import java.util.*;
public class search_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i=0,j=0,flag=0;
int A[]=new int[a];
for(i=0;i<a;i++) {
	A[i]=s.nextInt();
}
int element=s.nextInt();
for(j=0;j<a;j++) {
	if(A[j]==element) {
		flag=1;
	}
}
if(flag==1) {
	System.out.println("yes");
}
else {
	System.out.println("no");
}
	}

}
