
public class moveZeroes {
	public void moveZeroes(int[] nums) {
		int index=0;
		for (int i=0;i<nums.length;i++) {
			if(nums[i]!=0)
			{
				nums[index++]=nums[i];
			}
		}
		for(int i=index;i<nums.length;i++)
		{
			nums[index++]=0;
		}
    }
	 public static void main(String[] args) {
		 moveZeroes solution = new moveZeroes();

	        int[] testCase1 = {0, 1, 0, 3, 12};
	        solution.moveZeroes(testCase1);
	        System.out.print("Test Case 1: ");
	        for (int num : testCase1) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        int[] testCase2 = {0};
	        solution.moveZeroes(testCase2);
	        System.out.print("Test Case 2: ");
	        for (int num : testCase2) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Add more test cases as needed
	   }
}
