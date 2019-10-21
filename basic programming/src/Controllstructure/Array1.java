package Controllstructure;
import java.io.*;
public class Array1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter size");
int size=Integer.parseInt(br.readLine());
int[]values=new int[size];
int[]values1=new int[size];
System.out.println("enter the array elements");
for(int i=0;i<size;i++) {
	values[i]=Integer.parseInt(br.readLine());
	
}
System.out.println("enter the array2 elements");

for(int i=0;i<size;i++) {
	values1[i]=Integer.parseInt(br.readLine());

	
}
for(int i=0;i<size;i++) {
	System.out.println(values[i]+values1[i]);

}

	}

}
