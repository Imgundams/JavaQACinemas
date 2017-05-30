package qACinemas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Tests {

	@Test
	public void dayCheck() {
		String dayTest = "wednESDay YouD ont ne ED to Rea d This Fa r";
		DayCheck dateChecker = new DayCheck();
		assertTrue("Wednesday is discount day", dateChecker.dayAndDiscountConfirm(dayTest));
		dayTest = "monday";
		assertFalse("Monday is not discount day", dateChecker.dayAndDiscountConfirm(dayTest));
	}

	@Test
	public void customerCheck() {
		CinemaPricing customerChecker = new CinemaPricing();
		assertEquals("Standard and no discount", 8, customerChecker.mainPricing(false, CustomerTypes.STANDARD));
		assertEquals("Child and discount", 2, customerChecker.mainPricing(true, CustomerTypes.CHILD));
	}

	@Test
	// Given Example in Specification
	public void exampleCheck() {
		DayCheck dayCheck = new DayCheck();
		CinemaPricing pricing = new CinemaPricing();
		int totalCostOfTickets = 0;
		String theDayToday = "Monday";
		boolean isDiscount = dayCheck.dayAndDiscountConfirm(theDayToday);
		totalCostOfTickets += (pricing.mainPricing(isDiscount, CustomerTypes.STANDARD) * 1);
		totalCostOfTickets += (pricing.mainPricing(isDiscount, CustomerTypes.OAP) * 0);
		totalCostOfTickets += (pricing.mainPricing(isDiscount, CustomerTypes.STUDENT) * 1);
		totalCostOfTickets += (pricing.mainPricing(isDiscount, CustomerTypes.CHILD) * 1);
		assertEquals("One Standard,Student and Child Tickets is £18", 18, totalCostOfTickets);
	}
}
