package com.QA.BlackJackexp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	BlackJack b = new BlackJack(); 

@Parameters 
public static Collection <Object[]>data(){
	return Arrays.asList(new Object[][] {{0,-10,-10},{11,10,11},{20,5,20},{0,32,33},{0,-5,40}});
}

private int expected;
private int input1;
private int input2;

	public ParameterTest(int exp, int put1, int put2) {
		expected = exp;
		input1 = put1;
		input2 = put2;
	}

@Test
public void test() {
	assertEquals(expected, b.play(input1, input2));
}

}
