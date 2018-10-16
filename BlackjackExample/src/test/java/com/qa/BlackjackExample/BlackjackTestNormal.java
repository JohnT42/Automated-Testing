package com.qa.BlackjackExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackjackTestNormal {
	Blackjack b = new Blackjack();
	static int x=1; //static variable is ignored after the first time the program runs
	@BeforeClass
	public static void start() {
		System.out.println("Welcome to my Normal Entries Tests");x=1;// resets the counter
	}
	@Before
	public void setup() {
		System.out.println("Test "+x+"/2 start");
	}
	@After
	public void teardown() {
		System.out.println("Test "+x+"/2 completed");x++;
	}
	@AfterClass
	public static void end() {
		System.out.println("Test class completed");
		;
	}
	@Test
	public void Test1() {
		assertEquals("1 low compare entry, 1 high compare entry", 20, b.play(10, 20));
	}

	@Test
	public void Test2() {
		assertEquals("1 high compare entry, 1 low compare entry", 20, b.play(20, 10));
	}	
}
