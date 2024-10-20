public class findMaxAverage {
	public double findMaxAverage(int[] nums, int k) {
		double sum=0;
		for(int i=0;i<k;i++) {
			sum+=nums[i];
		}
		//System.out.println("sum"+sum);
		//double halfans = (sum%(double)k);
		double ans = (sum/k) ;
		int j=0;
		for (int i=k;i<nums.length;i++ )
		{
			sum-=nums[j];
			sum+=nums[i];
			
			ans = Math.max(ans, (sum/(double)k));
			j++;
		}
        return ans; // Placeholder return value
    }
	    
	public static void main(String[] args) {
		findMaxAverage solution = new findMaxAverage();
        int[] nums1 = {1,12,-5,-6,50,3};
        int k1 = 4;
        System.out.println(solution.findMaxAverage(nums1, k1)); // Expected output: 12.75

        int[] nums2 = {5};
        int k2 = 1;
        System.out.println(solution.findMaxAverage(nums2, k2)); // Expected output: 5.00
    }
}
