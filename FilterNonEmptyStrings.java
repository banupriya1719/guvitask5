package guvitask5;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class FilterNonEmptyStrings {                                                             //stream(): Converts the list into a stream.
	        // Given list of strings                                                                 //collect(Collectors.toList()): Collects the result into a new list.
		public static void main(String[] args) {                                                     //filter(str -> !str.isEmpty()): Removes empty strings.

	        List<String> strings = Arrays.asList("banu", "", "priya", "rose", "shashini", "", "yash");

	        // Filter non-empty strings using Stream API
	        List<String> nonEmptyStrings = strings.stream()
	                                              .filter(str -> !str.isEmpty()) // Remove empty strings
	                                              .collect(Collectors.toList());

	        // Print the filtered list
	        System.out.println("List with non-empty strings: " + nonEmptyStrings);
	    }
}