package com.java.Demo.CabInvoiceGenaratord;

import org.junit.Assert;
import org.junit.Test;

public class Cab_Invoice_Generator_Test {
	@Test
	public void calculateFareOfOneRide()  {
		Cab_Invoice_Generator Object=new Cab_Invoice_Generator();
		double test=Object.calculateFare(10, 15);
		Assert.assertEquals(115.0, test, 0.0);
	}
}
