public class maxVowels {
	public int maxVowels(String s, int k) {
		int count = 0, ans = 0;
		int left = 1;
		int right = k;
		for (int i=0;i<k;i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
			}
			ans = Math.max(ans, count);
		}
//		if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u')
//		{
//			count--;
//		}
		while(right<s.length()) {
			
			if(s.charAt(left-1)=='a' || s.charAt(left-1)=='e' || s.charAt(left-1)=='i' || s.charAt(left-1)=='o' || s.charAt(left-1)=='u') {
				count--;
			}
			if(s.charAt(right)=='a' || s.charAt(right)=='e' || s.charAt(right)=='i' || s.charAt(right)=='o' || s.charAt(right)=='u') {
				count++;
			}
			left++;
			right++;
			ans = Math.max(ans, count);
			
		}
		return ans;
    }
	public static void main(String[] args) {
		maxVowels solution = new maxVowels();

        // Test case 1
        String s1 = "abciiidef";
        int k1 = 3;
        System.out.println("Max vowels for s1: " + solution.maxVowels(s1, k1)); // Expected output: 4

        // Test case 2
        String s2 = "aeiou";
        int k2 = 2;
        System.out.println("Max vowels for s2: " + solution.maxVowels(s2, k2)); // Expected output: 2

        // Additional test cases
        String s3 = "leetcode";
        int k3 = 3;
        System.out.println("Max vowels for s3: " + solution.maxVowels(s3, k3)); // Expected output: 2

        String s4 = "rhythms";
        int k4 = 4;
        System.out.println("Max vowels for s4: " + solution.maxVowels(s4, k4)); // Expected output: 0

        String s5 = "tryhard";
        int k5 = 4;
        System.out.println("Max vowels for s5: " + solution.maxVowels(s5, k5)); // Expected output: 1
    }
}
