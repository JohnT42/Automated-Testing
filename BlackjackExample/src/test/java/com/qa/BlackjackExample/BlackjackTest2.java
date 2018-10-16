package com.qa.BlackjackExample;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BlackjackTest2 {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, -10, -10 }, { 0, -10, 10 }, { 0, -10, 30 }, { 0, -10, 50 },
				{ 0, 10, -10 }, { 20, 10, 20 }, { 20, 20, 10 }, { 10, 10, 30 }, { 0, 10, 50 }, { 0, 30, -10 },
				{ 10, 30, 10 }, { 0, 30, 30 }, { 0, 30, 50 }, { 0, 50, -10 }, { 0, 50, 10 }, { 0, 50, 30 },
				{ 0, 50, 50 } });
	}

	private int intPut;
	private int intPut2;
	private int intPected;
	//@Parameter//first data value(0) is default
	//public/*NOT private*/ int input;
	//
	//@Parameter(1)
	//public/*NOT private */ int Expected;
Blackjack b = new Blackjack();
	// constructor
	public BlackjackTest2(int expected, int input, int input2) {
		intPut = input;
		intPut2 = input2;
		intPected = expected;
	}

	@Test
	public void test() {
		
		assertEquals(intPected, b.play(intPut, intPut2));
	}
}
