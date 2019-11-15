package Basics;

public class bike extends vehicle{

	public void details(String bike, String colour, float cc, int speed, Double price, double discount) {
		// TODO Auto-generated method stub
		double total=price-discount;
		System.out.println(bike);
		System.out.println(colour);
		System.out.println(cc);
		System.out.println(speed);
		System.out.println(price);
		System.out.println(total);

	}

}
