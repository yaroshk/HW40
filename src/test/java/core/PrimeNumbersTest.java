package core;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)

public class PrimeNumbersTest {
	 private PrimeNumbers primenumbers;
	 @Before
	 	public void initialize() 
	 {
		 	primenumbers = new PrimeNumbers();  
     }
	 @Parameter(value = 0)
	 	public Integer inputNumber;
	 @Parameter(value = 1)
	 	public Boolean expectedResult;
	 @Parameters(name = "Iteration # {index}: Number: {0}; isPrime? {1}")
	 public static Collection<Object[]> primeNumbers() {
		 Object[][] data = new Object[][] 
				 {
			 {  1, true  },
			 {  2, true  },
			 {  6, false },
			 { 19, true  },
			 { 22, false },
			 { 31, false },
			 { 34, true  },
			 { 44, false },
			 { 48, true  },
			 { 52, true  },
			 { 55, false },
			 { 64, true  },
			 { 71, false },
			 { 74, true  },
			 { 79, false },
			 { 84, false },
			 { 85, false },
			 { 90, true  },
			 { 93, false },
			 { 97, true  },
			 {100, false }
				};
	 return Arrays.asList(data);
	 			}
	@Test
	
		 public void testPrimeNumberChecker() {
			System.out.println("Is " + inputNumber + " a prime number? - " + expectedResult);
				assertEquals(expectedResult, primenumbers.validate(inputNumber));
 }
}
