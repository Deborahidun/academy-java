package teachBack3;

//Premium customer discount (20% discount)
public class PremiumDiscount extends Discount {

	@Override
	public double applyDiscount(double price) {
		return price * 0.80; // 20% discount for Premium customers
	}

	@Override
	public String showDescription() {
		return "Premium Discount: 20% discount applied.";
	}
}
