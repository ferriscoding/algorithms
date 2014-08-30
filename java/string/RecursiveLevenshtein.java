package string;

/**
 * The Levenshtein distance determines how many characters need to modified/
 * created/deleted in order to change one string to another. An example from
 * Wikipedia:
 * 
 * For example, the Levenshtein distance between "kitten" and "sitting" is 3, since the following three edits change one into the other, and there is no way to do it with fewer than three edits:
 *
 *   kitten -> sitten (substitution of "s" for "k")
 *   sitten -> sittin (substitution of "i" for "e")
 *   sittin -> sitting (insertion of "g" at the end).
 *
 * http://en.wikipedia.org/wiki/Levenshtein_distance
 * 
 * @author ferris
 *
 */
public class RecursiveLevenshtein implements Levenshtein {

	
	public int calculate(String inputA, String inputB) {
		if(inputA != null && inputB != null) {
			return calcDistance(inputA, inputA.length(), inputB, inputB.length());
		}
		return -1;
	}
	
	private int calcDistance(String inputA, int aLen, String inputB, int bLen) {
		if(aLen == 0) {
			return bLen;
		} else if(bLen == 0) {
			return aLen;
		}
		int cost = 1;
		if(inputA.charAt(aLen - 1) == inputB.charAt(bLen - 1)) {
			cost = 0;
		}
		return Math.min((Math.min((calcDistance(inputA, aLen - 1, inputB, bLen) + 1),
				(calcDistance(inputA, aLen, inputB, bLen - 1) + 1))),
				(calcDistance(inputA, aLen - 1, inputB, bLen - 1) + cost));
	}
	
}
