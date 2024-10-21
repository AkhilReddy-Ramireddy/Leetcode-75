public class longestOnes {
	public static int longestOnes(int[] nums, int k) {
        int left=0,right=0,count=0,ans=0;
        while(right<nums.length) {
        	//System.out.println(nums[right]);
        	if( right<nums.length && nums[right]==0 && k>0) {
        		k--;
        		right++;
        		count = right-left;
        		ans = Math.max(ans, count);
        	}
        	if(right<nums.length && nums[right]==0 && k==0) {
        		if(nums[left]==0) {
        			k++;
            		left++;
            		count = right-left;
            		ans = Math.max(ans, count);
        		}
        		else if(nums[left]==1) {
        			left++;
        			count = right-left;
            		ans = Math.max(ans, count);
        		}
        	}
        	if(right<nums.length && nums[right]==1 && k>=0) {
        		right++;
        		count = right-left;
        		ans = Math.max(ans, count);
        	}
        }
        return ans; 
    }
	public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0,1};
        int k1 = 2;
        System.out.println(longestOnes(nums1, k1)); // Expected output: 6

        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k2 = 3;
        System.out.println(longestOnes(nums2, k2)); // Expected output: 10
    }
}
