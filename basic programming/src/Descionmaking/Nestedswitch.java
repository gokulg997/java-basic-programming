package Descionmaking;
import java.util.Scanner;
public class Nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
char branch='E';
int collegeyear=3;
switch(collegeyear){
case 1:
	System.out.printf("english,maths");
	break;
case 2:
	System.out.printf("enter the branch");
	switch(branch) {
	case 'c':
		System.out.printf("os,java");
		break;
	case 'E':
System.out.printf("micro processor");
break;
default:
	System.out.printf("invalid input");
	}
	break;
case 3:
	System.out.printf("enter the branch");
	switch(branch) {
	case 'c':
		System.out.printf("c++");
		break;
	case 'E':
		System.out.printf("microelecronics");
		break;
	case 'm':
		System.out.printf("drawing,mom");
		break;
		default:
			System.out.printf("invalid");
	}
	break;
	default:
		System.out.printf("invalid selection");
			
	
	}
	
}
	}


