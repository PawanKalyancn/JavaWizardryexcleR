package mavendemoo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.maveneccler.Calculation;

public class CalculationTest {
	Calculation cal =new Calculation();
	@Test
	
	public void test() {
					assertEquals(6, cal.add(3, 03));
		
					assertEquals(1, cal.sub(5, 04));

	}
	

}
