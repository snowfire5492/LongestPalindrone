

public class palindromicTest{
	
	public static void main(String[] args) {
		
		//String str = "badopapodds";
		String str = "cbbd";
		
		longestPalindrone lp = new longestPalindrone();
		
		
		String output = lp.findLongestPalindrone(str);
		
		
		System.out.println("Output: " + output);
	}
	
	
	
}

