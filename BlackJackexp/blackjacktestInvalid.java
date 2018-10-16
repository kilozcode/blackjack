package com.QA.BlackJackexp;

import static org.junit.Assert.*;


import org.junit.Test;

public class blackjacktestInvalid {
	BlackJack b = new BlackJack();

	public void testy4() {
	assertEquals(0, b.play(20, 0));

}@Test
	public void testy7() {
	assertEquals(0, b.play(20, 33));
}@Test
	
	public void testy8() {
	assertEquals(0, b.play(22, -4));
	
}
@Test
public void testy12() {
assertEquals(0, b.play(35, -22));
}@Test
public void testy13() {
assertEquals(0, b.play(35, 2));
}@Test
public void testy14() {
assertEquals(0, b.play(32, 22));
}@Test
public void testy15() {
assertEquals(0, b.play(32, 35));
}@Test
public void testy16() {
assertEquals(0, b.play(32, 32));
}
@Test
public void testy10() {
assertEquals(0, b.play(23, 32));
}
}