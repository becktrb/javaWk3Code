package arrayPt2;

public class Names {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = new String [6];
		
		names [0] = "Sam";
		names [1] = "Tommy";
		names [2] = "Tim";
		names [3] = "Sally";
		names [4] = "Buck";
		names [5] = "Bob";
		
		calculateAverageLetters(names);
		System.out.println(calculateAverageLetters(names));
		
	}
	
		public static int calculateAverageLetters(String[] names) {		
		
		int counter = 0;
		for (String letters : names) {
			
			counter += letters.length();
			
		}
		return counter / names.length ;
		
	
		
		
	}

		
}
