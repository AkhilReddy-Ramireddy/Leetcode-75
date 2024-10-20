import java.util.HashMap;

public class maxOperations {
	
	public int maxOperations(int[] nums, int k) {
		HashMap <Integer,Integer> hp = new HashMap<>();
		int count=0;
		for (int i=0;i<nums.length;i++)
		{
			if(hp.containsKey(nums[i]))
			{
				int val = hp.get(nums[i]);
				hp.put(nums[i], val+1);
				
			}
			else
			{
				hp.put(nums[i], 1);
			}
		}
		//System.out.print(hp);
		for (int num :nums)
		{
			int diff = k-num;
			System.out.print(" ,"+diff);
			if(hp.containsKey(diff))
			{
				if(hp.get(diff)>=1 && hp.get(num)>=1)
				{
					if(diff==num)
					{
						int val = hp.get(diff);
						if(val>=2)
						{
							hp.put(diff, val-2);
							count++;
						}
						
					}
					else
					{
						count++;
						int val = hp.get(diff);
						hp.put(diff, val-1);
						int val2 = hp.get(num);
						hp.put(num, val2-1);
				
					}
					
				}
				System.out.println(hp);
				System.out.println(count);
			}
		}
		//System.out.print(hp);
		return count; // Placeholder return
    }
	public static void main(String[] args) {
		maxOperations solution = new maxOperations();

//        // Test case 1
//        int[] nums1 = {1, 2, 3, 4};
//        int k1 = 5;
//        System.out.println("Max operations for nums1: " + solution.maxOperations(nums1, k1)); // Expected output: 2
//
//        // Test case 2
//        int[] nums2 = {3, 1, 3, 4, 3};
//        int k2 = 6;
//        System.out.println("Max operations for nums2: " + solution.maxOperations(nums2, k2)); // Expected output: 1
//
//        // Additional test cases
//        int[] nums3 = {1, 2, 3, 4, 5, 6};
//        int k3 = 7;
//        System.out.println("Max operations for nums3: " + solution.maxOperations(nums3, k3)); // Expected output: 3
//
//        int[] nums4 = {1, 1, 1, 1};
//        int k4 = 2;
//        System.out.println("Max operations for nums4: " + solution.maxOperations(nums4, k4)); // Expected output: 2
//
//        int[] nums5 = {5, 5, 5, 5};
//        int k5 = 10;
//        System.out.println("Max operations for nums5: " + solution.maxOperations(nums5, k5)); // Expected output: 2
        
        int[] nums6 = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        int k6 = 3;
        System.out.println("Max operations for nums6: " + solution.maxOperations(nums6, k6));
    }
}
