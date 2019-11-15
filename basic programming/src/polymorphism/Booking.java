package polymorphism;

public class Booking {

	public void details(String a, String c, String d, String e, String f) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+a);
		System.out.println("Address:"+c);
		System.out.println("Contact Number:"+d);
		System.out.println("Route:From "+e+" to "+f);
	}

	public void total(int g, int h) {
		// TODO Auto-generated method stub
		double total=g*h;
		System.out.println("total cost:"+total);
		System.out.println("Thanks for Booking,Your Seat is Booked");
	}

}
