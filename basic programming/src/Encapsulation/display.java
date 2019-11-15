package Encapsulation;

public class display extends book{
	


	public void disp(String name,
	String address,
	String ContactNumber,
	String email,
	String prooftype,
	String proofid) {
		// TODO Auto-generated method stub
		System.out.println("name:"+getName());
		System.out.println("Address:"+getAddress());
		System.out.println("ContactNumber:"+getContactNumber());
		System.out.println("Email:"+getEmail());
		System.out.println("Prooftype:"+getProoftype());
		System.out.println("Proofid:"+getProofid());
		System.out.println("registration successful");


	}}
