package compareDouble;

public class DoubleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] nums1 = new double [] {36.50, 10.50, 2.50};  //49.5 / 3 = 16.50
		double [] nums2 = new double [] {12.50, 6.50, 22.50};  //41.50 / 3 = 13.83

		
		compareDouble(nums1, nums2);
		System.out.println(compareDouble(nums1, nums2));
	}
	
		
			
		public static boolean compareDouble(double [] nums1, double [] nums2) {
		if (average(nums1) > average2(nums2))	{
			return true;
		}
		return false;
			
			
		}
		public static double average(double [] nums1) {
			int sum = 0;
			for (double average : nums1) {
				sum += average;
			}
			return sum / nums1.length;
			
					
		}
		public static double average2(double [] nums2) {
			int sum2 = 0;
			for (double average2 : nums2) {
				sum2 += average2;
			}
			return sum2 / nums2.length;
			
					
		}
}
