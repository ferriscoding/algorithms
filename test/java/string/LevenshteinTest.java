package string;

import org.junit.Test;

import junit.framework.Assert;

public class LevenshteinTest {
	
	
	private Levenshtein l;
	
	@Test
	public void recursiveLevenshtein() {
		l = new RecursiveLevenshtein();
		Assert.assertEquals(l.calculate("kitten", "sitting"), 3);
	}
	
	@Test
	public void recursiveLevenshteinFiveChar() {
		l = new RecursiveLevenshtein();
		Assert.assertEquals(l.calculate("abcde", "fghij"), 5);
	}
	
	@Test
	public void recursiveLevenshteinTenChar() {
		l = new RecursiveLevenshtein();
		Assert.assertEquals(l.calculate("abcdeabcde", "fghijfghij"), 10);
	}
	
	@Test
	public void recursiveLevenshteinElevenChar() {
		l = new RecursiveLevenshtein();
		Assert.assertEquals(l.calculate("abcdeabcdea", "fghijfghijf"), 11);
	}
	
	@Test
	public void recursiveLevenshteinTwelveChar() {
		l = new RecursiveLevenshtein();
		Assert.assertEquals(l.calculate("abcdeabcdeab", "fghijfghijfg"), 12);
	}
	
	@Test
	public void recursiveLevenshteinThirteenChar() {
		l = new RecursiveLevenshtein();
		Assert.assertEquals(l.calculate("abcdeabcdeabc", "fghijfghijfgh"), 13);
	}
	
	@Test
	public void recursiveLevenshteinFourteenChar() {
		l = new RecursiveLevenshtein();
		Assert.assertEquals(l.calculate("abcdeabcdeabcd", "fghijfghijfghi"), 14);
	}
	
	@Test
	public void recursiveLevenshteinFifteenChar() {
		l = new RecursiveLevenshtein();
		Assert.assertEquals(l.calculate("abcdeabcdeabcde", "fghijfghijfghij"), 15);
	}
	
}
