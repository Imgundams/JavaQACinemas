package qACinemas;

import java.util.Scanner;

public class CustomerInput {
	Scanner scanner = new Scanner(System.in);

	public void inputMovieSelection() {
		int movieSelectionID = scanner.nextInt();
		System.out.println(movieSelectionID);
	}

	public String inputWhatDayItIs() {
		String dayOfTheWeek = scanner.nextLine();
		return dayOfTheWeek;
	}

	public int TicketCount() {
		int ticketCount = scanner.nextInt();
		return ticketCount;
	}
	
	public void closeScanner() {
		scanner.close();
	}
}
