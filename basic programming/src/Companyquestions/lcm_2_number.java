package Companyquestions;
import java.util.*;
public class lcm_2_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int min=s.nextInt();
int max=s.nextInt();
int lcm=0;
int max1=(min>max)?min:max;
for(int i=max1;i<=min*max;i++) {
	if(i%min==0&&i%max==0) {
		lcm=i;
		break;	
	}
	
}
System.out.println(lcm);
	}

}
