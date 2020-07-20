package org.testng;

import org.testng.annotations.*;

public class Case1 {
	@Test
	private void tc1() {
		System.out.println("tc1"+ Thread.currentThread().getId() );
	}

	@Test
	private void tc2() {
		
	System.out.println("testing github");

	}

	@Test
	private void tc3() {
		System.out.println("tc3"+ Thread.currentThread().getId() );

	}

}
