package com.QA.BlackJackexp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackJackTest {
	BlackJack b = new BlackJack();
	static int count =1;
			@BeforeClass
			public static void anything() {
			System.out.println("welcome to text");
			
			}
			@Before
			public void setup() {
				System.out.println("test" +count+"/17");
			}
			@After 
			public void teardown() {
				System.out.println("test"+count+"1/17 finished");
				count ++ ;
			}
			@AfterClass
			public static void finish() {
				System.out.println("test class completed");
				
			}
			
        @Test
	    public void testy() {
        	assertEquals(0, b.play(-10, -10));
	    
        }      
        
  
		public void testy4() {
		assertEquals(0, b.play(20, 0));
}@Test
		public void testy5() {
		assertEquals(20, b.play(20, 12));
}@Test
		public void testy6() {
		assertEquals(20, b.play(20, 24));
}@Test
		public void testy7() {
		assertEquals(0, b.play(20, 33));


}@Test
		public void testy9() {
		assertEquals(0, b.play(23, 22));
}@Test
		public void testy10() {
		assertEquals(0, b.play(23, 32));
}@Test
		public void testy11() {
		assertEquals(4, b.play(25, 4));
}@Test
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

}
		
		
		

		
