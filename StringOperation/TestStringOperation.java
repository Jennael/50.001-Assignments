public class TestStringOperation {
	/**
	 * @param args
	 */
	public static void main (String[] args) {
        
		System.out.println(StringOperation.isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
		System.out.println(StringOperation.isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));		
	    System.out.println(StringOperation.isPermutation("@ab", "a@b"));
	    System.out.println(StringOperation.isPermutation("abcd", "bcdA"));
		
	}
}