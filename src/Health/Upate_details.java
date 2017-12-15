package Health;

import java.util.Scanner;

public class Upate_details extends Patient_details{
	String pname,gender,ch;
	int age;

	public void update(){
	System.out.println("Do you want to modify the patient details");
	System.out.println("Type yes or no");
	Scanner sc=new Scanner(System.in);
	ch=sc.next();
	if(ch=="yes"||ch=="y")
	{
	System.out.println("Enter the Patient name");
	pname=sc.next();
	System.out.println("Enter the gender");
	gender=sc.next();
	try{
	System.out.println("Enter the Patient age");
	age=sc.nextInt();
	}
	catch(Exception e){
		System.out.println("Enter the your details again Note:Integer value for age");
		update();
	}
	}
	
		
	
	}
}
