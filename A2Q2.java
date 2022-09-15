// ----------------------------------------------------------------------------
// Assignment 2 Question 2
// Written by: William Zicha 40127016
// For COMP 248 Section S - Fall 2021
// Creating a registration program for new coming Concordia University students
// A program to book a Covid-19 vaccine appointment, collect user input and validate
// ----------------------------------------------------------------------------
import java.util.Scanner;

public class A2Q2 {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in); // Define Scanner
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++"); // Print Vaccine Menu
		System.out.println("\tWelcome to Covid19 Vaccine Appointment Program!");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Here is the Covid-19 vaccine menu:");
		
		System.out.println("\t1. Pfizer");
		System.out.println("\t2. Moderna");
		System.out.println("\t3. AstraZeneca");
		System.out.println("\t4. Johnson&Johnson");
		System.out.println("\t5. Sinovac");
		System.out.println("\t6. Gamaleya");
		System.out.println("\t7. Exit.");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println ();
		System.out.print("Please enter your choice (1-7): ");
		int vaccineChoice = myScanner.nextInt();
		// Switch statement used to print details based on vaccine details
		// CASE 1 PFIZER
		while (vaccineChoice >= 7 || vaccineChoice < 1)
		{			
		System.out.println("");
		System.out.print("That is a wrong input. Please try again! ");
		vaccineChoice = myScanner.nextInt();
		}
		
		switch (vaccineChoice)
		{
		case 1: 
			System.out.println("Your choice is: Pfizer.");
			System.out.println ();
			System.out.println("Please choose the location of vaccine Pfizer:");
		    System.out.println("\t1 - Pharmaprix");
		    System.out.println("\t2 - Jean Coutu");
		    System.out.print("Please enter your choice: ");
		    int locationChoice = myScanner.nextInt();
		    	if (locationChoice == 1 || locationChoice == 2)
		    	{
		    		System.out.println ();
		    		System.out.println("Please choose the time slots :");
		            System.out.println("\t1 - 2:00 - 2:15");
		            System.out.println("\t2 - 2:20 - 2:35");
		            System.out.println("\t3 - 2:40 - 2:55");
		            System.out.println("\t4 - 3:00 - 3:15");
		            System.out.println("\t5 - Quit");
		            System.out.print("Please enter your choice (1-5): ");
		            int timeChoice = myScanner.nextInt();
		            while (timeChoice < 1 || timeChoice > 4)
		    		{			
		    		System.out.println("");
		    		System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
		    		String rebook = myScanner.next();
		    			while (rebook.equals("yes"))
		    			{
		    				System.out.print("Please enter your choice (1-7): ");
		    				vaccineChoice = myScanner.nextInt();
		    					while (vaccineChoice >= 7 || vaccineChoice < 1)
		    					{			
		    						System.out.println("");
		    						System.out.print("That is a wrong input. Please try again! ");
		    						vaccineChoice = myScanner.nextInt();
		    						
		    					}
		    						switch (vaccineChoice)
		    						{
		    						case 1: 
		    						case 2:
		    						case 3:
		    						case 4:
		    						case 5:
				    				System.out.println("Sorry, Sinovac is not available now!");
				    				break;
		    						case 6:
				    				System.out.println("Sorry, Gamaleya is not available now!");
				    				break;
		    						case 7:
				    				System.out.println("");
				    				System.out.println("That is a wrong input. Please try again! ");
				    				break;
				    			}
		    			}
		    			if (rebook.equals("no"))
		    			{
		    				System.out.println ();
		    				System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
		    				break;
		    			}
		    			
		    	}		
		            } } 
		    	{
		    		System.out.println ();
		    		System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
		    		String rebook = myScanner.next();
	    			while (rebook.equals("yes"))
	    			{
	    				System.out.print("Please enter your choice (1-7): ");
	    				vaccineChoice = myScanner.nextInt();
	    					while (vaccineChoice >= 7 || vaccineChoice < 1)
	    				{			
	    				System.out.println("");
	    				System.out.print("That is a wrong input. Please try again! ");
	    				vaccineChoice = myScanner.nextInt();
	    				}
	    				
	    			}
	    			if (rebook.equals("no"))
	    			{
	    				System.out.println ();
	    				System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
	    				break;
	    			}
		    	}
		    	System.out.println ();
		        System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
		        int vaccineShot = myScanner.nextInt();
		        break;
		case 2:
			System.out.println("Your choice is: Moderna.");
			System.out.println ();
			System.out.println("Please choose the location of vaccine Moderna:");
		    System.out.println("\t1 - Pharmaprix");
		    System.out.println("\t3 - Uniprix Clinique");
		    System.out.println("\t4 - Health Center");
		    System.out.print("Please enter your choice: ");
		    locationChoice = myScanner.nextInt();
	    		if (locationChoice == 1 || locationChoice == 3 || locationChoice == 4)
	    		{
	    		System.out.println ();
	    		System.out.println("Please choose the time slots :");
	            System.out.println("\t1 - 2:00 - 2:15");
	            System.out.println("\t2 - 2:20 - 2:35");
	            System.out.println("\t3 - 2:40 - 2:55");
	            System.out.println("\t4 - 3:00 - 3:15");
	            System.out.println("\t5 - Quit");
	    		}
	    		else 
	    		{
	    		System.out.println ();
	    		System.out.println("Your appointment is not booked successfully! Would you like to try again?");
	    		}
			break;
		case 3:
			System.out.println("Your choice is: AstraZeneca.");
			System.out.println ();
			System.out.println("Please choose the location of vaccine AstraZeneca:");
			System.out.println("\t2 - Jean Coutu");
			System.out.println("\t3 - Uniprix Clinique");
		    System.out.print("Please enter your choice: ");
		    locationChoice = myScanner.nextInt();
    		if (locationChoice == 2 || locationChoice == 3)
    		{
    		System.out.println ();
    		System.out.println("Please choose the time slots :");
            System.out.println("\t1 - 2:00 - 2:15");
            System.out.println("\t2 - 2:20 - 2:35");
            System.out.println("\t3 - 2:40 - 2:55");
            System.out.println("\t4 - 3:00 - 3:15");
            System.out.println("\t5 - Quit");
    		}
    		else 
    		{
    		System.out.println ();
    		System.out.println("Your appointment is not booked successfully! Would you like to try again?");
    		}
			break;
		case 4:
			System.out.println("Your choice is: Johnson&Johnson.");
			System.out.println ();
			System.out.println("Please choose the location of vaccine Johnson&Johnson:");
		    System.out.println("\t4 - Health Center");
		    System.out.print("Please enter your choice: ");
		    locationChoice = myScanner.nextInt();
    		if (locationChoice == 4)
    		{
    		System.out.println ();
    		System.out.println("Please choose the time slots :");
            System.out.println("\t1 - 2:00 - 2:15");
            System.out.println("\t2 - 2:20 - 2:35");
            System.out.println("\t3 - 2:40 - 2:55");
            System.out.println("\t4 - 3:00 - 3:15");
            System.out.println("\t5 - Quit");
    		}
    		else 
    		{
    		System.out.println ();
    		System.out.println("Your appointment is not booked successfully! Would you like to try again?");
    		}
			break;
		case 5:
			System.out.println("Sorry, Sinovac is not available now!");
			break;
		case 6:
			System.out.println("Sorry, Gamaleya is not available now!");
			break;
		case 7:
			System.out.println("");
			System.out.println("That is a wrong input. Please try again! ");
			break;
		}
	
		
		
		System.out.println ();
		
		myScanner.close(); // Close Scanner
		
	}

}
