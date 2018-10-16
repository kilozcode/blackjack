package com.QA.BlackJackexp;

import static org.junit.Assert.*;


import org.junit.Test;

public class blackjacktestnormal {
	BlackJack b = new BlackJack();

	@Test
	public void testy5() {
	assertEquals(20, b.play(20, 12));
}@Test
	public void testy6() {
	assertEquals(20, b.play(20, 24));
}
}
