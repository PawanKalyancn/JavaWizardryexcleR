package stringprg;

public class XYBALACED {
/*6.
We'll say that a String is xy-balanced if for all the 'x' 
chars in the string, there exists a 'y' char somewhere 
later in the string. So "xxy" is balanced, but "xyx" is not.
 One 'y' can balance multiple 'x's. Return true if the given 
 string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
public boolean xyBalance(String str) {
  
}
 * 
 * 
 * 
 */
	
	public boolean xyBalance(String str) {
	    int lastIndexX = -1;
	    int lastIndexY = -1;

	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == 'x') {
	            lastIndexX = i;
	        } else if (str.charAt(i) == 'y') {
	            lastIndexY = i;
	        }
	    }

	    return lastIndexY >= lastIndexX;
	}

	public static void main(String[] args) {
	    XYBALACED obj = new XYBALACED();
	    
	    boolean result1 = obj.xyBalance("aaxbby");
	    boolean result2 = obj.xyBalance("aaxbb");
	    boolean result3 = obj.xyBalance("yaaxbb");
	    
	    System.out.println(result1); // Output: true
	    System.out.println(result2); // Output: false
	    System.out.println(result3); // Output: false
	}
}