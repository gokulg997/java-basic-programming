package polymorphism;

public class bike {

	public void details(String color2, int speed2, int seats2, int wheels2) {
		// TODO Auto-generated method stub
		//public void details(String color1, int speed1, int seats1, int wheels1) {
			System.out.println("color"+color2);
			System.out.println("speed"+speed2);
			System.out.println("seats"+seats2);
			System.out.println("seats"+wheels2);
			}
			}
			class Bike extends car{
			public void details(String color2, int speed2, int seats2, int wheels2)
			{
			System.out.println("color"+color2);
			System.out.println("speed"+speed2);
			System.out.println("seats"+seats2);
			System.out.println("seats"+wheels2);
			}
			}


	
