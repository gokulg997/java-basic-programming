package Abstract1;
import java.util.*;
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s=new Student();
	s.totalmark();
	}

}
abstract class rank{
	abstract void totalmark();
	public void rank1() {
		System.out.println("rank 2");
	}
}
