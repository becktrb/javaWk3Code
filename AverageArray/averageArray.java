package AverageArray;

public class averageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int [3];
		
		num [0] = 40;
		num [1] = 30;
		num [2] = 40;
		
		
		
		calculateAverage(num);
		System.out.println(calculateAverage(num));
	}
	
	
	public static double calculateAverage(int [] num) {
		int sum = 0;
		for (int average : num) {
			sum += average;
		}
		return sum / num.length;
		
				
	}

}




