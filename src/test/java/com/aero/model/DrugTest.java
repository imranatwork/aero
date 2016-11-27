package com.aero.model;


import static org.junit.Assert.*;

import org.junit.Test;

public class DrugTest {

	@Test
	public void testDrug(){
		Drug drug = new Drug();
		drug.setDrugIdentifier("01Aser31");
		drug.setName("Paracetamol");
		
		assertEquals(drug.getName(),"Paracetamol");
	}
}
