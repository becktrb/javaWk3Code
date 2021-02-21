package concatenateNames;

public class concatenateNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = new String [6];
		
		names [0] = "Sam";
		names [1] = "Tommy";
		names [2] = "Tim";
		names [3] = "Sally";
		names [4] = "Buck";
		names [5] = "Bob";
		
		concatenateLetters(names);
		System.out.println(concatenateLetters(names));
		
	}
	
		public static String concatenateLetters(String[] names) {		
		
		String group = " ";
		for (String letters : names) {
			
			group += letters + " ";
			
		}
		return group;
		
	
		
		
	}

}
