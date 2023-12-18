package pattern;

public class Pattern1 {

	static void pattern( int n) {
		
for(int i=1;i<=n;i++) {//row 

	for(int j=i;j<=n+1-i;j++) {//coloums
	System.out.print("*");
	
			}

	System.out.println();

		}

	}
	
	
	public static void main(String[] args) {
		
		pattern(6);
	}

}
