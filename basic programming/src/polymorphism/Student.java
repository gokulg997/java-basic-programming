package polymorphism;

public class Student {

	public void name(String a) {
		// TODO Auto-generated method stub
		System.out.println("Student name:"+a);
	}

	public void rno(int b) {
		// TODO Auto-generated method stub
		System.out.println("Roll number:"+b);
	}

	public void branch(String c) {
		// TODO Auto-generated method stub
		System.out.println("Branch name:"+c);
		
	}

	public void total(int mal, int eng, int hind, int ss, int maths, int sci) {
		// TODO Auto-generated method stub
	double	tot=mal+eng+hind+ss+maths+sci;
	System.out.println("total Score:"+tot);
	if(tot>450) {
		System.out.println(" rank:1");
	}
	else if(tot>400) {
		System.out.println("rank:2");
	}
	else if(tot>350) {
		System.out.println("rank:3");
	}
	else if(tot>300) {
		System.out.println("rank:4");
	}
	else {
		System.out.println("failed");
	}
		
	}

	public void avg(int mal, int eng, int hind, int ss, int maths, int sci) {
		// TODO Auto-generated method stub
		double avg=(mal+eng+hind+ss+maths+sci)/6;
		System.out.println("averagre:"+avg);
	}

	
}
