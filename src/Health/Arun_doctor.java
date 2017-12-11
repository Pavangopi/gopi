package Health;

import java.util.HashMap;
import java.util.Map;

class Arun_doctor extends Arunhospital implements doctor{
	public void doctor_details(){
		HashMap<String,String>lp=new HashMap<String,String> ();
		lp.put("Dr. Arun Sathish", " 09566275879");
		lp.put("Dr. Anitha Sathish", " 09566275878");
		lp.put("Dr. Arjun Sathish", " 09566275877");
		for(Map.Entry m:lp.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  } 
		//System.out.println("Dr. Arun Sathish A (Arun Hospital) in Kovilambakkam, Chennai");
		//System.out.println("Dr. Anitha Sathish A (Arun Hospital) in Medavakkam, Chennai");
		//System.out.println("Dr. Arjun Sathish A (Arun Hospital) in Taramani, Chennai");
		
	}
	
	public void ambulance(){
		System.out.println("ambulance at kovilambakkam contact number 09566275879 ");
	}
}