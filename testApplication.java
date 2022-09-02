
public class testApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is a comment
		/*
		 * primitive:
		 * int - an integer (whole number)
		 * double - decimal places 32.89
		 * float - precision decimal data type 45.6435
		 * long - like an int, but higher numbers
		 * short - like an int, but lower numbers/range
		 * byte - small amt of data(8 bits of data)
		 * char - one single character - a i f & ! any at all
		 * boolean - true of false
		 * 
		 * Objects 
		 * String - is textual data, string of characters
		 * 
		 * Operators - perform actions on operands
		 * ex.   + - *  / 
		 * 
		 */
		
		//variable declaration - type, identifier, assignment operator, value, semicolon
		int adamsAge = 29;
		double accountBalance = 34.67;
		char middleInitial = 'M';
		boolean isHotOutside = true;
		String firstName = "Adam";
		boolean isAge29 = adamsAge == 29;
		System.out.println(adamsAge);
		System.out.println(accountBalance);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(isAge29);
		
		
		//Running an operation using an operator on an operand
	
		adamsAge = adamsAge + 1;
		System.out.println(adamsAge);
		
		String lastName = "Moore";
		String fullName = firstName + " " + lastName;  //concatenation
		System.out.println(fullName);
		
		//running boolean true or false operations 
		
		
		System.out.println(isAge29);
		
		
	}

}
