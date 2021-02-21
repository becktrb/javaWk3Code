package buyCostco;

public class buyCostco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] costcoItems = new double [] {99.99, 36.50, 5.99, 122.50, 10.59,139.99, 69.99 };  //485.55
		double  bankBalance = 683.00;

		
		canYouAffordIt(costcoItems, bankBalance);
		System.out.println(canYouAffordIt(costcoItems, bankBalance));
	}
	
		
			
		public static boolean canYouAffordIt(double [] costcoItems, double bankBalance) {
		if (costcoItems(costcoItems) < bankBalance)	{
			return true;
		}
		return false;
			
			
		}
		public static double costcoItems(double [] costcoItems) {
			int sum = 0;
			for (double items : costcoItems) {
				sum += items;
			}
			return sum;
			
					
		}
		

}
