package string;

import java.util.Arrays;

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
public class DynamicRecursiveLevenshtein implements Levenshtein {

	private int[][] levMatrix;
	
	public int calculate(String inputA, String inputB) {
		if(inputA != null && inputB != null) {
			levMatrix = new int[inputA.length()][inputB.length()];
			for (int[] row: levMatrix)
			    Arrays.fill(row, -1);
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
		
		if(levMatrix[aLen - 1][bLen - 1] != -1) {
			return levMatrix[aLen - 1][bLen - 1];
		}
		
		int cost = 1;
		if(inputA.charAt(aLen - 1) == inputB.charAt(bLen - 1)) {
			cost = 0;
		}
		int value = Math.min((Math.min((calcDistance(inputA, aLen - 1, inputB, bLen) + 1),
				(calcDistance(inputA, aLen, inputB, bLen - 1) + 1))),
				(calcDistance(inputA, aLen - 1, inputB, bLen - 1) + cost));
		levMatrix[aLen - 1][bLen - 1] = value;
		return value;
	}
}
