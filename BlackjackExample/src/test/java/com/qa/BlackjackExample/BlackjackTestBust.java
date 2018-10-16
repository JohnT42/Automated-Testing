package com.qa.BlackjackExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackjackTestBust {
	Blackjack b = new Blackjack();
	static int x=1; //static variable is ignored after the first time the program runs
	@BeforeClass
	public static void start() {
		System.out.println("Welcome to my  Bust Entries Tests");
		x=1;// resets the counter
	}
	@Before
	public void setup() {
		System.out.println("Test "+x+"/3 start");
	}
	@After
	public void teardown() {
		System.out.println("Test "+x+"/3 completed");x++;
	}
	@AfterClass
	public static void end() {
		System.out.println("Test class completed");
		;
	}
	

	@Test
	public void Test1() {
		assertEquals("1 compare entry, 1 bust entry ", 10, b.play(10, 30));
	}


	@Test
	public void Test2() {
		assertEquals("1 bust entry and 1 compare entry", 10, b.play(30, 10));
	}

	@Test
	public void Test3() {
		assertEquals("2 bust entries", 0, b.play(30, 30));
	}


}
