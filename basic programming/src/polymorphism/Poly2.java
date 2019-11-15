package polymorphism;
import java.util.*;
public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
Student st=new Student();
System.out.println("name");
String a=s.next();
System.out.println("r.no");
int b=s.nextInt();
System.out.println("branch");
String c=s.next();
System.out.println("Enter marks");
int mal=s.nextInt();
int eng=s.nextInt();
int hind=s.nextInt();
int ss=s.nextInt();
int maths=s.nextInt();
int sci=s.nextInt();
//double tot,avg,
int rank;
st.name(a);
st.rno(b);
st.branch(c);
st.total(mal,eng,hind,ss,maths,sci);
st.avg(mal,eng,hind,ss,maths,sci);

	
	}

}
