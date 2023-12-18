package stringprg;

public class BOBthestring {

	public static boolean bobThere(String str) {
	    for (int i = 0; i < str.length() - 2; i++) {
	        if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
	            return true;
	        }
	    }
	    return false;
	}
/*
 * 5. Return true if the given string contains a "bob" string, 
 * but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
public boolean bobThere(String str) {
  
}
* 
 * 
 * 
 * 
 */
	
	
	public static void main(String[] args) {
	    boolean result = bobThere("babu");
	    System.out.println(result);
	    boolean result1 = bobThere("babu la ke babu kalyan babu");
	    System.out.println(result1);
	}
}