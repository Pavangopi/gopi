package Health;

import java.util.Scanner;

class Problem extends Optiming {
	public void disease(){
	int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("1.fever 2.cough&cold flu 3.cardiology consultation 4.neurology consulation 5.ciritcal health");
	System.out.println("Enter ur problem in number format");
	ch=sc.nextInt();
	Optiming op=new Optiming();
	switch(ch){
	case 1:
		System.out.println("Treatment for normal fever and take any one of the following tablet");
		System.out.println("paracetamol morning and evening one capsule");
		System.out.println("                   or");
		System.out.println(" Actaminophen morning and evening one capsule");
		System.out.println("                   or");
		System.out.println(" Tylenol morning and evening one capsule");
		System.out.println("op timing are as follows 9:00 to 16:00 and 18:00 to 21:00");
		op.book();
		System.out.println("For other queries please contact Dr. Arjun Sathish 09566275879 ");
		break;
	case 2:
		System.out.println("Treatment for cough&cold flu and take any one of the following tablet");
		System.out.println("DEMAZIN morning and evening one capsule");
		System.out.println("op timing are as follows 9:00 to 16:00 and 18:00 to 21:00");
		op.book();
		System.out.println("For other queries please contact Dr. Arjun Sathish 09566275879 ");
		break;
	case 3:
		System.out.println("op timing are as follows 9:00 to 16:00 and 18:00 to 21:00");
		op.book();
		System.out.println("For other queries please contact cardology consulating Dr. Arun Sathish 09566275878");
		break;
	case 4:
		System.out.println("op timing are as follows 9:00 to 16:00 and 18:00 to 21:00");
		op.book();
		System.out.println("For other queries please contact neurology consulating Dr. Anitha Sathish 09566275879");
		break;
	case 5:
		System.out.println("op timing are as follows 9:00 to 16:00 and 18:00 to 21:00");
		op.book();
		System.out.println("For other queries please contact  critical health care consulating Dr. Arjun Sathish 09566275870");
		break;
		default:
			System.out.println("enter correct option");
			break;
	}

	}
	public void ambulance(){
		System.out.println("ambulance at Madavakkam contact number 09566275870");
	}
	
}
