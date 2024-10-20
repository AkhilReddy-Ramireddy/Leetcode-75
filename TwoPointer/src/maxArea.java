public class maxArea {
	public int maxArea(int[] height) {
        int leftindex = 0;
        int rightindex = height.length-1;
        int maxarea = 0;
        while(leftindex < rightindex) {
        	int difference = Math.abs(leftindex - rightindex);
        	int product = difference * Math.min(height[leftindex], height[rightindex]);
        	maxarea = Math.max(maxarea, product);
        	if(height[leftindex]>height[rightindex])
        		rightindex--;
        	else
        		leftindex++;
        }
        return maxarea;
	}
	public static void main(String[] args) {
		maxArea solution = new maxArea();
        
        // Test case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max area for height1: " + solution.maxArea(height1)); // Expected output: 49

        // Test case 2
        int[] height2 = {0,2};
        System.out.println("Max area for height2: " + solution.maxArea(height2)); // Expected output: 1
    }
}
