package stringprg;

public class StringREaptlastCharater {

	public static String repeatEnd(String str, int n) {
	    int strLength = str.length();              // Get the length of the input string "RAM" (which is 3)
	    String repeatedSubstring = str.substring(strLength - n); // Extract the last 'n' characters from the string ("RAM" - "AM" in this case)

	    StringBuilder result = new StringBuilder(); // Create a StringBuilder to build the result string

	    for (int i = 0; i < n; i++) {  // Start a loop that iterates 'n' times (in this case, 3 times)
	        result.append(repeatedSubstring);  // Append the last 'n' characters ("AM") to the result in each iteration
	    }

	    return result.toString();  // Convert the StringBuilder to a String and return the result
	}


	
	public static void main(String[] args) {

		String result1= repeatEnd("RAM", 3);
	System.out.println(result1);
	}

}
