package Basics;

public class Scooter extends vehicle{

	public void details(String bike1, String colour1, float cc1, int speed1, Double price1, double discount1) {
		// TODO Auto-generated method stub
		double total1=price1-discount1;
		System.out.println(bike1);
		System.out.println(colour1);
		System.out.println(cc1);
		System.out.println(speed1);
		System.out.println(price1);
		System.out.println(total1);

	}

}
