package Health;

import java.util.*;

public class Patient_details {
	String pname,gender,ch;
	int age;
	int s=age+111;
	public void details(){

	Scanner sc=new Scanner(System.in);
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
		details();
	}
	}
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
	else {
		patient_display();
	}
	}
	public void patient_display(){
		System.out.println("     ARUN HOSPITAL     ");
	
		System.out.println("  Consultation Number:" +s);
		System.out.println("-----------------------------");
		System.out.println("Patient Name     : "+pname);
		System.out.println("Patient Gender   : "+gender);
	    System.out.println("Patient Age      : "+age);
	    System.out.println("Consultation Fee : 200");
	    System.out.println("For other queries please contact Hospital: 0870-2421534 ");
	}

}
