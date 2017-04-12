
public class longestPalindrone {

	
	public String findLongestPalindrone(String s) {
		
		int start = 0, end = 0;
		
		for(int i = 0; i < s.length(); ++i) {
			
			int len0 = expandAroundCenter(s, i, i);
			int len1 = expandAroundCenter(s, i, i + 1);
			int len2 = Math.max(len0, len1);
			
			if(len2 > end - start) {
				start = i - (len2 -1)/2;
				end = i + len2/2;
			}
			
		}
		
		return s.substring(start, end + 1);
	}
	
	
	private int expandAroundCenter(String s, int left, int right) {
		
		int l = left;
		int r = right;
		
		while(l>=0 && r<s.length() && s.charAt(l) == 
s.charAt(r)) {
			--l;
			++r;
		}
		
		return r - l - 1;
	}
	
	
}

