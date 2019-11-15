package polymorphism;

public class vehicle {

	public void details(String color1, int speed1, int seats1, int wheels1, String option1) {
		// TODO Auto-generated method stub
			System.out.println("color"+color1);
			System.out.println("speed"+speed1);
			System.out.println("seats"+seats1);
			System.out.println("Wheels:"+wheels1);
			System.out.println("AC:"+option1);
			}
			}
			class bullet extends vehicle{
			public void details(String color2, int speed2, int seats2, int wheels2,String option2)
			{
			System.out.println("color:"+color2);
			System.out.println("speed:"+speed2);
			System.out.println("seats:"+seats2);
			System.out.println("wheels:"+wheels2);
			System.out.println("discbreak:"+option2);
			}
			


	}


