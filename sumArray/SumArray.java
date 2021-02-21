package sumArray;

public class SumArray {

	public static void main(String[] args) {
		int [] num = new int [3];
		
		num [0] = 40;
		num [1] = 30;
		num [2] = 40;
		
		greaterThan100(num);
		System.out.println(greaterThan100(num));
	}
	
	public static boolean greaterThan100(int [] num) {
	   int sum = 0;
		for (int number : num) {
			sum += number;
			
			} if (sum > 100) {
				return true;
			}
			return false;
				
			
		
		
	}	
	
}




