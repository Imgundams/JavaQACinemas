package qACinemas;

public class DayCheck {

	public boolean dayAndDiscountConfirm(String todayis) {
		todayis = todayis.trim();
		todayis = todayis.split(" ")[0];
		todayis = todayis.toUpperCase();
		switch (todayis) {
		case "MONDAY":
		case "TUESDAY":
		case "THURSDAY":
		case "FRIDAY":
		case "SATURDAY":
		case "SUNDAY":
			return false;
		case "WEDNESDAY":
			return true;
		default:
			throw new AssertionError();
		}
	}
}
