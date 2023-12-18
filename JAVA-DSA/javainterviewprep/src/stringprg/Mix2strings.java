package stringprg;

public class Mix2strings {
	
	/*2) Given two strings, a and b, create a bigger string made of the first char of a, 
	 * the first char of b, the second char of a, the second char of b, 
	 * and so on. Any leftover chars go at the end of the result.

	mixString("abc", "xyz") → "axbycz"
	mixString("Hi", "There") → "HTihere"
	mixString("xxxx", "There") → "xTxhxexre"
	public String mixString(String a, String b) {
  
	}
 
	 */
	public static String mixString(String a, String b) {
	    StringBuilder result = new StringBuilder();
	    int lengthA = a.length();
	    int lengthB = b.length();
	    int maxLength = Math.max(lengthA, lengthB);

	    for (int i = 0; i < maxLength; i++) {
	        if (i < lengthA) {
	            result.append(a.charAt(i));
	        }
	        if (i < lengthB) {
	            result.append(b.charAt(i));
	        }
	    }

	    return result.toString();
	}

	public static void main(String[] args) {
		
		String result1 = mixString("abc", "xyz");
		String result2 = mixString("Hi", "There");
		String result3 = mixString("xxxx", "There");

		System.out.println(result1); // Output: "axbycz"
		System.out.println(result2); // Output: "HTihere"
		System.out.println(result3); // Output: "xTxhxexre"

	}

}
