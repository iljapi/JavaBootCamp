package sef.module3.sample;

/**
 * @author
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		CastingSample.Calculator normalCalc = new CastingSample.Calculator(CastingSample.Calculator.CALC_TYPE_BASIC);
		
		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");
		
		// Add 
		int result = normalCalc.add(4, 5);
		System.out.println("1) Add result is " + result);
		
				
		// Multiply 
		int[] mul = {2, 3, 4};
		result = normalCalc.multiply(mul);
		System.out.println("2) Multiplication result is " + result); 
		

	}


	public static class CastingSample {

		public static void main(String arg[]){

			int intVar=1;
			char charVar='A';
			long longVar=99;
			float floatVar=1.2f;


			//Implicit Casting;
			//This is allowed because characters is actually implemented as integer
			//Each character has a specific integer value as defined by the Unicode table
			intVar = charVar;
			System.out.println(intVar);

			//Implicit Casting
			//widening conversion
			//A long is 'wider' than an int,therefore it has enough 'space' to accommodate the
			//value represented by any integer
			longVar = intVar;
			System.out.println(longVar);

			//Explicit Cast
			//narrowing conversion
			//An explicit cast is needed because a 'float' is wider than a long. We need to 'cast'
			//the float to turn it into a long.  As a result, the original float value will lose some data
			//In this case, it will only retain the integer portion of the value
			longVar = (long)floatVar;
			System.out.println(longVar);


		}

		/**
		 * @author
		 *
		 */


		public static class Calculator {


			private String calculatorType;
			public static final String CALC_TYPE_BASIC = "Basic";

			// Default constructor
			public Calculator() {}

			// Parameterized constructor
			public Calculator(String calculatorType) {
				this.calculatorType = calculatorType;
			}

			// Getter for CalculatorType
			public String getCalculatorType() {
				return calculatorType;
			}

			// Setter for CalculatorType
			public void setCalculatorType(String calculatorType) {
				this.calculatorType = calculatorType;
			}

			// Add
			public int add(object ;) {
				int sum = x + y;
				return sum;
			}

			// Subtract
			public int subtract(int x, int y) {
				int diff = 0;
				if (x > y) {
					diff = x - y;
				} else {
					diff = y - x;
				}

				return diff;
			}

			// Multiply
			public int multiply(int[] numbers) {
				int temp = 1;

				for (int i = 0; i < numbers.length; i++) {
					temp = temp * numbers[i];
				}
				return temp;

			}

			// Divide
			public int divide(int x, int y) {
				int divValue = 0;
				if (x == 0 || y == 0) {
					divValue = 0;
				} else {
					divValue = x / y;
				}
				return divValue;

			}
		}
	}
}
