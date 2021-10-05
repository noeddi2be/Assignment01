import java.util.Scanner;

//************************************************************************
// Calculates the most economic way to get to uni from a certain city
//************************************************************************


public class publicTransport {

	public static void main(String[] args) {

	int NUMB_OF_DAYS = 30 * 2;		//30 weeks of regular school days per year (2 days/week)

	Scanner scan = new Scanner(System.in);
	System.out.println("Option 1: one way tickets regular price");
	System.out.println("Option 2: one way ticket in combination with half fare abo");
	System.out.println("Option 3: multi trip ticket in combinaton with half fare abo");
	System.out.println("Option 4: general abo yearly payment\n");
	
	System.out.print("Enter the price for a one-way ticket from your city to the uni: ");
	float singleTicket = scan.nextFloat();

	System.out.print("Enter the price for a multi-trip ticket from our city to the uni: ");
	float multiTripTicket = scan.nextFloat();

	System.out.print("Enter the price for a half fare abo: ");
	float halfFareAbo = scan.nextFloat(); 
	
	System.out.print("Enter the price for a GA travel card with yearly payment: ");
	float generalAbo = scan.nextFloat(); 

	System.out.println("");
	scan.close();

	float option1 = singleTicket * NUMB_OF_DAYS * 2;
	float option2 = (option1 / 2) + halfFareAbo;
	float option3 = (NUMB_OF_DAYS * 2 / 6) * multiTripTicket + halfFareAbo;
	float option4 = generalAbo;

	boolean cheapestOption1 = option1 < option2 & option1 < option3 & option1 < option4;
	boolean cheapestOption2 = option2 < option1 & option2 < option3 & option2 < option4;
	boolean cheapestOption3 = option3 < option1 & option3 < option2 & option3 < option4;
	boolean cheapestOption4 = option4 < option1 & option4 < option2 & option4 < option3;

	System.out.println("Option 1: " + option1 + " CHF" + "\nOption 2: " + option2 + " CHF");
	System.out.println("Option 3: " + option3 + " CHF" + "\nOption 4: " + option4 + " CHF\n");
	System.out.println("The cheapest option is:\n");
	System.out.println("Option 1: " + cheapestOption1);
	System.out.println("Option 2: " + cheapestOption2);
	System.out.println("Option 3: " + cheapestOption3);
	System.out.println("Option 4: " + cheapestOption4);

	}
}