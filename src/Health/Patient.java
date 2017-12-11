package Health;

import java.util.Scanner;

public class Patient {
	public static void main(String args[]){
		String pname,gender;
		int age;
		Arunhospital ah=new Arunhospital();
		ah.hospital_details();
		Arun_doctor ad=new Arun_doctor();
		ad.doctor_details();
		ad.ambulance();
		Problem p=new Problem();
		p.ambulance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Patient name");
		pname=sc.next();
		System.out.println("Enter the Patient age");
		age=sc.nextInt();
		System.out.println("Enter the gender");
		gender=sc.next();
		
		p.disease();
		
	}
}