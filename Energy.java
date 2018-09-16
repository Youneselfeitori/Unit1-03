/****************************************************************
*Created by: Younes Elfeitori
*Created on: 15 September 2018
*This program calculates the a mass of an object in Kg and out 
*puts the amount of Energy in Joules.
*
*****************************************************************/
import java.util.Scanner;

public class Energy {
	public static void main(String args[]){
		Scanner UserInput = new Scanner(System.in);
		
		double SpeedOfLight;
		double Mass;
		double Energy;
		
		//Input
		System.out.println("Enter the Mass of the object in Kg here: ");
		//Assigning Mass to User Input
		Mass = UserInput.nextDouble();
		
		//Assignment
		SpeedOfLight = Math.pow(299792458, 2);	
		
		//Calculation
		Energy = SpeedOfLight * Mass;
		
		//Output Energy in Joules
		System.out.println(Energy + "J of Energy can be produced" );
		
				
				
		
	}

}
