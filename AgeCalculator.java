package guvitask5;
	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Scanner;

	public class AgeCalculator {
	    public static void main(String[] args) {
	        // Scanner to take user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter their birthdate
	        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
	        String birthdateInput = scanner.nextLine();
	        
	        // Convert input string to LocalDate
	        LocalDate birthdate = LocalDate.parse(birthdateInput);
	        
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();
	        
	        // Calculate the age
	        Period age = Period.between(birthdate, currentDate);
	        
	        // Display the age
	        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
	                age.getYears(), age.getMonths(), age.getDays());
	        
	        // Close the scanner
	        scanner.close();
	    }
	}