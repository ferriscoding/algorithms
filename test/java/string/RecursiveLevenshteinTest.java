package string;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class RecursiveLevenshteinTest {
	
	private Levenshtein l;
	
	@Before
	public void init() {
		l = new RecursiveLevenshtein();
	}
	
	@Test
	public void recursiveLevenshtein() {
		Assert.assertEquals(l.calculate("kitten", "sitting"), 3);
	}
	
	@Test
	public void recursiveLevenshteinFiveChar() {
		Assert.assertEquals(l.calculate("abcde", "fghij"), 5);
	}
	
	@Test
	public void recursiveLevenshteinTenChar() {
		Assert.assertEquals(l.calculate("abcdeabcde", "fghijfghij"), 10);
	}
	
	@Test
	public void recursiveLevenshteinElevenChar() {
		Assert.assertEquals(l.calculate("abcdeabcdea", "fghijfghijf"), 11);
	}
	
	@Test
	public void recursiveLevenshteinTwelveChar() {
		Assert.assertEquals(l.calculate("abcdeabcdeab", "fghijfghijfg"), 12);
	}
	
	@Test
	public void recursiveLevenshteinThirteenChar() {
		Assert.assertEquals(l.calculate("abcdeabcdeabc", "fghijfghijfgh"), 13);
	}
	
	@Test
	public void recursiveLevenshteinFourteenChar() {
		Assert.assertEquals(l.calculate("abcdeabcdeabcd", "fghijfghijfghi"), 14);
	}
	
	@Test
	public void recursiveLevenshteinFifteenChar() {
		Assert.assertEquals(l.calculate("abcdeabcdeabcde", "fghijfghijfghij"), 15);
	}
	
	@Test
	public void recursiveLevenshteinSentence() {
		Assert.assertEquals(l.calculate("The quick brown fox jumps over the lazy dog",
				"The slow orange turtle slides across the pavement"), 34);
	}
	
}
