package Health;

import java.util.Scanner;

public class Patient {
	public static void main(String args[]){
	
		Arunhospital ah=new Arunhospital();
		ah.hospital_details();
		Arun_doctor ad=new Arun_doctor();
		ad.doctor_details();
		ad.ambulance();
		Problem p=new Problem();
		p.ambulance();
		Patient_details pd=new Patient_details();
		pd.details();
	
	//pd.update();
		p.disease();
		//pd.update();
		pd.patient_display();
		
	}
}