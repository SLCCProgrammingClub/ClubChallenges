package challenge3;

/**
 * SLCC Programming Club - Coding Challenge 3
 * October 19, 2022
 * 
 * This week's coding challenges focus on common interview questions you may encounter some day.
 * Implement the methods below based off of the instructions provided in the doc comments.
 * 
 * NOTE: This week, basic tests have been added to the test client in an effort to maximize our
 * 		 limited meeting time so that you can focus solely on implementation. Add or change the 
 *       tests however you see fit!
 * 
 * @author ...
 */
public class Challenge3 {
	
	/**
	 * Reverses a given String without using methods from class String.
	 * 
	 * EXAMPLES:
	 * backwardsString("SECRET TUNNEL") → "LENNUT TERCES"
	 * backwardsString("secret tunnel") → "lennut terces"
	 * backwardsString("through the mountain") → "niatnuom eht hguorht" 
	 * 
	 * @returns reversed String
	 */
	public static String backwardsString(String str) {
		return ""; //TODO
	}
	
	/**
	 * Creates a char array of all letters that appear more than once
	 * in a given String.
	 * 
	 * EXAMPLES:
	 * duplicates("secret secret secret secret") → {secrt }
	 * duplicates("tunnelllllllllll yeah") → { nel } 
	 * 
	 * @param str string
	 * @return array of duplicate characters present in given string
	 */
	public static char[] duplicates(String str) {		
		return null;
	}
	
	/**
	 * CHALLENGE:
	 * Determines the second highest number in an unsorted integer array.
	 * 
	 * EXAMPLES:
	 * secondHighest(new int[] {5, 3, 13}) → 5
	 * secondHighest(new int[] {234, 987, 534}) → 534
	 * 
	 * @param arr array of ints
	 * @return the second highest number
	 */
	public static int secondHighest(int[] arr) {
		return 0; //TODO
	}

	// ==================================TEST CLIENT====================================
	public static void main(String[] args) {
		
		// backwardsString tests =======================================================
		String irohQuote = "I know you're not supposed to cry over spilled tea, but... "
							+ "it's just so sad.";
		System.out.println("Reversed Iroh - Expected: .das os tsuj s'ti ...tub ,aet " +
							"dellips revo yrc ot desoppus ton er'uoy wonk I");
		System.out.println("Reversed Iroh - Actual: \n" + backwardsString(irohQuote));
		
		
		// duplicates tests ============================================================
		String cabbageVenderQuote = "MY CABBAGES!!!!"; // Returns {AB!}
		System.out.println("Cabbage Duplicates - Expected: AB!");
		System.out.print("Cabbage Duplicates - Actual: ");
		if(duplicates(cabbageVenderQuote) != null) {
			for(char c : duplicates(cabbageVenderQuote)) {
				System.out.print(c);
			}
			System.out.println();
		} else {
			System.out.println("null\n");
		}
		

		// secondHighest tests ========================================================
		int[] arr = {234, 98, 867, 323, 342, 398, 5, 745, 234, 233, 123, 576, 134, 322};
		System.out.println("Second Highest - Expected: 745");
		System.out.println("Second Highest - Actual: " + secondHighest(arr));
		

	}

}
