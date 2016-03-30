package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import util.PerformanceAvaliation;

public class PerformanceAvaliationTest {
	
	@Test
	public void throughputTest() {
		PerformanceAvaliation pe = new PerformanceAvaliation();
		assertTrue(2 == pe.throughput(4, 2).doubleValue());			
		assertTrue(2.5 == pe.throughput(5, 2).doubleValue());
	}
}
