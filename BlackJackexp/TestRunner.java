package com.QA.BlackJackexp;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
public static void main (String[] args) {
	TestRunner.allTests();
	
}
public static void allTests() {
	Result result=JUnitCore.runClasses(
			invalidSuite.class,
			validSuite.class);
	System.out.print("all results passed:"+result.wasSuccessful());
	
	if (!result.wasSuccessful()) {
		System.out.println("failed tests:");
		for (Failure failure: result.getFailures()) {
			System.out.println(failure.getMessage());
		}
	}
}
}
