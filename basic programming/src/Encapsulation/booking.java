package Encapsulation;

public class booking {
	int price;
int per;int i=1,j=0;
String name;
String g;
int age;
double tot=0,sum=0;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getG() {
	return g;
}
public void setG(String g) {
	this.g = g;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPer() {
	return per;
}
public void setPer(int per) {
	this.per = per;
}
public void book(int per, int price) {
	// TODO Auto-generated method stub
	System.out.printf("Ticket detatils are..");
	System.out.printf("Ticket details are....\n");
	System.out.printf("Number Of Passengers:%d\n",per);
	System.out.printf("Price Of Ticket:%d\n",price);
	}
public double ticket(int age, String g, int per, int price) {
	// TODO Auto-generated method stub
	j++;
	tot=0;
	double m=.25,o=.10,q=.50;
	if(age<16)
	{
	tot=(double)sum+(price-(price*q));
	sum=tot;
	return tot;
	}
	else if(g.contentEquals("F")==true&&age>=16)
	{
	tot=sum+(price-price*o);
	sum=tot;
	return tot;
	}
	else if(age>64)
	{
	tot=sum+(price-price*m);
	sum=tot;
	return tot;
	}
	else
	{
	tot=sum+price;
	sum=tot;
	return tot;
	
	}
}
	

	
	


	



	
}




