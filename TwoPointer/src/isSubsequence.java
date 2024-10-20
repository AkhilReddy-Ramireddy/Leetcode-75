
public class isSubsequence {
	public boolean isSubsequence(String s, String t) {
//		s.toCharArray();
//		t.toCharArray();
        int indexs=0,indext=0;
        if(s.length()==0)
            return true;
        while(indexs<s.length() && indext<t.length()) {
        if(s.charAt(indexs) == t.charAt(indext) && indexs<s.length() && indext<t.length())
        {
        	indexs++;
        	indext++;
        }
        else
        {
        	indext++;
        }
        if(s.length()==indexs)
        {
        	return true;
        }
        }
        return false;
    }
	public static void main(String[] args) {
		isSubsequence solution = new isSubsequence();

        String s1 = "";
        String t1 = "ahbgdc";
        System.out.println("Test Case 1: " + solution.isSubsequence(s1, t1)); // Expected output: true
	}
}
