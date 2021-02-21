package fullNameMethod;

public class FullName {

	public static void main(String[] args) {
		
		String firstName = "Nancy";
		String lastName = "Smith";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		
		pow(3, 4);
		System.out.println(pow(3, 4));
	}
	
	
	public static String createFullName(String fName, String lName) {
		String fullName = fName + " " + lName;
		return fullName;
		}
		
	
	public static double pow(int base, int exponent) {
		double baseRaised = (Math.pow(base, exponent));
		return baseRaised; 
	}
		

}
