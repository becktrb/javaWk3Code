package willBuyDrink;

public class WillBuyDring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money = 10.60;
		boolean isHot = true;
		
		
		willBuyDrink(isHot, money);
		System.out.println(willBuyDrink(isHot, money));
	}
	public static boolean willBuyDrink(boolean isHot, double money) {
		if (isHotOutside(isHot) && moneyInPocket(money))	{
			return true;
		}
		return false;
			
			
		}
	private static boolean moneyInPocket(double money) {
		if (money > 10.50) {
			return true;
		}
		return false;
	}
	private static boolean isHotOutside(boolean isHot) {
		if (isHot) {
			return true;
		}
		return false;
	}

}
