package Health;

import java.util.*;

public class Patient_details {
	String pname,gender;
	int age;
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
	public void patient_display(){
		System.out.println("Patient Name  :  "+pname);
		System.out.println("Patient Gender:  "+gender);
	    System.out.println("Patient Age   :  "+age);
	    System.out.println("For other queries please contact Dr. Arjun Sathish 09566275879 ");
	}

}
