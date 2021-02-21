package javaWk3Code;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = new int[9];
				
				age [0] = 3;
				age [1] = 9;
				age [2] = 23;
				age [3] = 64;
				age [4] = 2;
				age [5] = 8;
				age [6] = 28;
				age [7] = 93;
				age [8] = 95;
				
				diff(age);
				calculateAverageAge(age);
				
				
				System.out.println(calculateAverageAge(age));
				
			
}

	private static void diff(int[] age) {
		 
		double diff = age[age.length-1] - age[0];
	//	System.out.println(diff);
	}
	
	public static int calculateAverageAge(int[] age) {
		int sum = 0;
		for (int average : age) {
			sum += average;
		}
		return sum / age.length;
		
				
	}
}
