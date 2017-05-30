package qACinemas;

public class CustomerOutput {

	public void outputMovieSelection() {
		System.out.println("Welcome to QA Cinema you will be watching Space Balls");
	}

	public void outputAskWhatDayIsIt() {
		System.out.println("Please enter what day is it today");
		System.out.println("Monday, Tuesday, Wenesday, Thursday, Friday, Saturday, Sunday");
		System.out.print("Please enter one of the days above: ");
	}

	public void outputUnrecognisedDay() {
		System.out.println("The day of the week you entered was not recongnised, please try again.");
	}

	public void outputDiscountDay(boolean isDiscount, String todayIs) {
		if (isDiscount)
			System.out.println(todayIs + " is discount day, lucky you.");
		else
			System.out.println(todayIs + " is not discount day.");
	}

	public void outputStandardCustomerQuantity() {
		System.out.print("Please enter the quantity of Standard Tickets: ");
	}

	public void outputOAPCustomerQuantity() {
		System.out.print("Please enter the quantity of OAP Tickets: ");
	}

	public void outputStudentCustomerQuantity() {
		System.out.print("Please enter the quantity of Student Tickets: ");
	}

	public void outputChildCustomerQuantity() {
		System.out.print("Please enter the quantity of Child Tickets: ");
	}

	public void outputUnrecognisedQuantity() {
		System.out.println("You didn't enter a number, Start from the beginning.");
	}

	public void outputFinalPrice(int totalPrice) {
		System.out.println("The total costs for all the tickets you are purchasing is £" + totalPrice);
		System.out.println("Thank you for your patronage, we hope to see you again soon.");
	}
}
