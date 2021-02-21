package nameLengths;

public class NameLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] nameLengths = new int [6];
			
			nameLengths [0] = 3;
			nameLengths [1] = 5;
			nameLengths [2] = 3;
			nameLengths [3] = 5;
			nameLengths [4] = 4;
			nameLengths [5] = 3;
			
			
		
			int sum = 0;
			for (int length : nameLengths) {
				sum += length;
				System.out.println(sum);
			}
		}

	
		
		

}

