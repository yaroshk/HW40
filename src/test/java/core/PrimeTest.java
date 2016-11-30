package core;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class PrimeTest {

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
			 {  3, true  },
			 {  4, false  },
			 {  5, true  },
			 {  6, false  },
			 {  7, true  },
			 {  8, false  },
			 {  9, false },
			 { 10, false  },
			 { 11, true  },
			 { 12, false  },
			 { 13, true  },
			 { 14, false  },
			 {  15, false  },
			 {  16, false },
			 {  17, true  },
			 {  18, false  },
			 {  19, true  },
			 {  20, false  },
			 {  21, false  },
			 {  22, false  },
			 {  23, true  },
			 { 24, false  },
			 { 25, false  },
			 { 26, false  },
			 { 27, false  },
			 { 28, false  },
			 { 29, true  },
			 { 30, false  },
			 { 31, true  },
			 { 32, false  },
			 { 33, false  },
			 { 34, false  },
			 { 35, false  },
			 { 36, false },
			 {  37, true  },
			 {  38, false  },
			 {  39, false  },
			 {  40, false  },
			 {  41, true  },
			 {  42, false  },
			 {  43, true  },
			 {  44, false  },
			 {  45, false  },
			 { 46, false  },
			 { 47, true  },
			 { 48, false  },
			 { 49, false  },
			 { 50, false },
			 {  51, false  },
			 {  52, false  },
			 {  53, true  },
			 {  54, false  },
			 {  55, false  },
			 {  56, false  },
			 {  57, false  },
			 {  58, false  },
			 {  59, true  },
			 { 60, false  },
			 { 61, true  },
			 { 62, false  },
			 { 63, false  },
			 { 64, false  },
			 { 65, false  },
			 { 66, false  },
			 { 67, true  },
			 { 68, false  },
			 { 69, false  },
			 { 70, false  },
			 { 71, true  },
			 { 72, false },
			 { 73, true },
			 { 74, false  },
			 { 75, false },
			 { 76, false  },
			 {77, false },
			 {  78, false  },
			 {  79, true  },
			 {  80, false  },
			 {  81, false  },
			 {  82, false  },
			 {  83, true  },
			 {  84, false  },
			 {  85, false  },
			 {  86, false  },
			 { 87, false  },
			 { 88, false  },
			 { 89, true  },
			 { 90, false  },
			 { 91, false },
			 { 92, false },
			 { 93, false  },
			 { 94, false  },
			 { 95, false  },
			 { 96, false },
			 { 97, true },
			 { 98, false  },
			 { 99, false },
			 { 100, false },
			 				};
	 return Arrays.asList(data);
	 			}
	@Test
	
		 public void testPrimeNumberChecker() {
			System.out.println("Is " + inputNumber + " a prime number? - " + expectedResult);
				assertEquals(expectedResult, primenumbers.validate(inputNumber));
}
}