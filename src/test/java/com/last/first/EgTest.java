package com.last.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class EgTest {
	
	eg e=new eg();
	@Test
	public void testadd()
	{
		assertEquals(e.add(),3);
	}
	
	@Test
	public void testsub()
	{
		assertEquals(e.sub(),2);
	}
	
}
