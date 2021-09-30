package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindrome {
	
private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	 public void test1() {
		assertEquals(true, tjb.checkPalindrome("aabaa"));
	}
	
	@Test
	 public void test2() {
		assertEquals(false, tjb.checkPalindrome("abac"));
	}
	

}
