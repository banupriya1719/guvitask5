package guvitask5;
import java.util.stream.Stream;

	public class UppercaseConverter {
	    public static void main(String[] args) {
	        // Given stream of strings
	        Stream<String> names = Stream.of("rose", "Priya", "shashini");

	        // Convert to Uppercase using map() and print the result
	        names.map(String::toUpperCase)         
	             .forEach(System.out::println);
	    }
	}