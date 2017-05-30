package qACinemas;

import java.util.InputMismatchException;

public class CinemaRunner {

	public static void main(String[] args) {

		CustomerInput inputs = new CustomerInput();
		CustomerOutput outputs = new CustomerOutput();
		DayCheck dayCheck = new DayCheck();
		CinemaPricing pricing = new CinemaPricing();
		boolean errorInput = true;
		int totalCostOfTickets = 0;
		outputs.outputMovieSelection();

		do {
			try {
				outputs.outputAskWhatDayIsIt();
				String theDayToday = inputs.inputWhatDayItIs();	
				boolean isDiscount = dayCheck.dayAndDiscountConfirm(theDayToday);
				outputs.outputDiscountDay(isDiscount, theDayToday);
				outputs.outputStandardCustomerQuantity();
				totalCostOfTickets += (pricing.mainPricing(isDiscount, CustomerTypes.STANDARD) * inputs.TicketCount());
				outputs.outputOAPCustomerQuantity();
				totalCostOfTickets += (pricing.mainPricing(isDiscount, CustomerTypes.OAP) * inputs.TicketCount());
				outputs.outputStudentCustomerQuantity();
				totalCostOfTickets += (pricing.mainPricing(isDiscount, CustomerTypes.STUDENT) * inputs.TicketCount());
				outputs.outputChildCustomerQuantity();
				totalCostOfTickets += (pricing.mainPricing(isDiscount, CustomerTypes.CHILD) * inputs.TicketCount());
				errorInput = false;
			} catch (AssertionError e) {
				outputs.outputUnrecognisedDay();
			} catch (InputMismatchException e2) {
				outputs.outputUnrecognisedQuantity();
			}
		} while (errorInput);
		outputs.outputFinalPrice(totalCostOfTickets);
		inputs.closeScanner();
	}

}
