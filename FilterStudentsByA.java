package guvitask5;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class FilterStudentsByA {
	    public static void main(String[] args) {
	        // List of student names
	        List<String> students = Arrays.asList("Aparna", "Banu", "Andrew", "Chellam", "Amanda", "Dilip", "Anna", "sneha", "Anurama", "Rama");

	        // Filter students whose names start with "A"
	        List<String> studentsWithA = students.stream()                           //converts list into a stream
	                                             .filter(name -> name.startsWith("A")) // using Lambda expression
	                                             .collect(Collectors.toList());             //collect the name into a list

	        // Print the filtered students
	        System.out.println("Students whose names start with 'A': " + studentsWithA);
	   }
}