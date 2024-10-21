 	
public class longestSubarray {
	public static int longestSubarray(int[] nums) {
	int left=0,right=0,count=0,ans=0,k=1;
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
	return ans-1;
}
    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1};
        
        System.out.println(longestSubarray(nums1)); // Expected output: 3

        int[] nums2 = {0,1,1,1,0,1,1,0,1};
        
        System.out.println(longestSubarray(nums2)); // Expected output: 5
    }
}
