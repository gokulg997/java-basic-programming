package Basics;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	char b=0;int c=0;
	String e=" ";
	for(int i=0;i<a.length();i++) {
		b=a.charAt(i);
	
	//for(int i=0;i<a.length()-1;i++) {
		if (b=='A'||b=='E'||b=='I'||b=='O'||b=='U'||b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
			c++;}
		for( int j=0;j<c;j++) {
			
			System.out.print("*");}
		System.out.print("b");
for( int k=0;k<c;k++) {
			
			System.out.print("*");}}
     else {
		System.out.print("b");}
		}
	}
}



