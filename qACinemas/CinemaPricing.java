package qACinemas;

public class CinemaPricing {

	public int mainPricing(boolean discountDay, CustomerTypes customerType) {
		int discount = 0;
		if (discountDay)
			discount = -2;
		switch (customerType) {
		case STANDARD:
			return 8 + discount;
		case OAP:
			return 6 + discount;
		case STUDENT:
			return 6 + discount;
		case CHILD:
			return 4 + discount;
		default:
			throw new AssertionError();
		}
	}
}
