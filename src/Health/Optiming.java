package Health;
import java.util.*;
public class Optiming {
	public void book(){
		int c;
		System.out.println("Book your op");
		System.out.println("enter your option in number format");
		System.out.println("1.Yes 2.No");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		switch(c){
		case 1:
			int time;
			System.out.println("enter your avaiable time atleast a hour matching with doctor op timing");
			System.out.println("enter the time in railway time and in number format ex:11");
			time=sc.nextInt();
			if(time>=9 && time<=16 ||time>=18 && time<=21){
				System.out.println("Your op is confirmed at:"+time+":00");
			}
			else
			{
				System.out.println(" entered time does not match with doctor op timings");
				
			}
			break;
		case 2:
			System.out.println("Thanks for visiting our site");
			System.out.println("For further details please contact 09566275878");
			break;
		default:
			System.out.println("enter correct option");
			break;
			
		
		}
	}
}
