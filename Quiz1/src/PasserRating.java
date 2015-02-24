import java.util.Scanner;

public class PasserRating {
	
	public static void main(String[] args){
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input of 5 statistics
		System.out.print("Enter number of passing attempts: ");
		double att = input.nextDouble();
		
		System.out.print("Enter number of completions: ");
		double comp = input.nextDouble();
		
		System.out.print("Enter number of yards: ");
		double yds = input.nextDouble();
		
		System.out.print("Enter number of touchdown passes: ");
		double td = input.nextDouble();
		
		System.out.print("Enter number of interceptions: ");
		double inter = input.nextDouble();
		
		// Calculations for formula
		double a = (((comp / att) - (0.3)) * 5);
	
		double b = ((yds / att) - (3))*(0.25);
		
		double c = ((td / att)* 20);
		
		double d = 2.375-((inter/att)*25);
		
		
		// Create a list of statistics
		double[] myList = new double [4];
		myList[0] = a;
		myList[1] = b;
		myList[2] = c;
		myList[3] = d;
		
		// Apply the maximum/minimum clause to the list
		for (int i = 0; i < myList.length; i++){
			
			if (myList[i] < 0)
				
				myList[i] = 0;
				
			else if (myList[i] > 2.375)
				
				myList[i] = 2.375;
			
			else
				
				myList[i] = myList[i];
				
				
			
		}
		
		
		// Calculate Passer Rating
		double passer_rating;
		
		passer_rating = ((a + b + c + d)/6)*100;
		
		System.out.println("The QB's passer rating is: " + passer_rating);
		
	}
	

}
