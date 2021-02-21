package codeMethods;

public class Hello {

	public static void main(String[] args) {
		
		String word = "hello";
		int n = 3;
		String words = concatenateWords(word, n);
		System.out.println(concatenateWords(word, n));
	}
	
	public static String concatenateWords(String word, int n) {
		String words = " ";
		for (int i=0; i<= n; i++) {
		words += word;
		}
		return words;
	}
	
	
	
	}
	
	
	


