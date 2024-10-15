package teachBack3;

public class LoyaltyDiscount extends Discount {

	@Override
	public double applyDiscount(double price) {
		return price * 0.90;
	}

	@Override
	public String showDescription() {
		return "Loyalty Discount: 10% discount applied";

	}
}
