// ----------------------------------------------------------------------------
// Assignment 2 Question 1
// Written by: William Zicha 40127016
// For COMP 248 Section S - Fall 2021
// Creating a registration program for new coming Concordia University students
// Collect user input (strings) and generate a 7-digit random number as student ID
// ----------------------------------------------------------------------------
import java.util.Scanner;


public class A2Q1 
{

	public static void main(String[] args) {
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t Welcome to Concordia University \t");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println ();

		
	// Define the scanner
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Are you a new coming student at Concordia? (yes or no)");
		String newStudent = myScanner.next();
		System.out.println ();
		
// Construct an if else statement to determine if student is new or current
		if (newStudent.equals("yes"))
		{
			System.out.print("Please enter your name (Lastname, Firstname seperated by comma): ");
			String lastNameFirstName = myScanner.next();
// Create two substrings to gather the user's first and last name			
			String lastName = lastNameFirstName.substring(0, lastNameFirstName.indexOf(","));
			String firstName = lastNameFirstName.substring(lastNameFirstName.indexOf(",")+1, lastNameFirstName.length());
			
			System.out.println ();
			System.out.print("Please enter your date of birth: ");
			String dateOfBirth = myScanner.next();
			System.out.println ();
			
			System.out.print("Do you have covid19 vaccine passport? (true or false): ");
			String covidPassport = myScanner.next();
			System.out.println ();
			System.out.print("Please enter your department: ");
			String department = myScanner.next();
			System.out.println ();
			System.out.println("Congratulations, " + firstName + " " + lastName + "! You have successfully registered at Concordia University!");
			System.out.println ();
// Use the math.random function multiplied by 10^7 since our student ID is 7 digits		
			int studentId = (int)(Math.random() *10000000);
			 
			System.out.println("Your student ID is " + studentId + ".");
			System.out.println ();
// Let the user know that they should get vaccinated			
			if (covidPassport.equals("false"))
			{
				System.out.println(" Hope you will get your vaccine passport soon! Take care!");
				System.out.println ();
				System.out.println("Thank you for using this Program!");
			}
			else
			{
				System.out.println("Thank you for using this Program!");
			}
		}
		else
		{
			System.out.println("Welcome back! Hope you are having a great semester!\n\nThank you for using this Program!");
		}

		
		
// Close the Scanner
		myScanner.close();
	}

}
