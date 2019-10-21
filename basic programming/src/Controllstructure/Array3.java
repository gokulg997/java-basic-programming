package Controllstructure;
import java.io.*;
public class Array3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size");
		int size=Integer.parseInt(br.readLine());
		int[]a=new int[size];
		int m=0;
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]>=m) {
				m=a[i];
			}
		}
		System.out.println(m);
	}

}
