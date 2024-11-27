package kr.ac.woosuk.testdouble;

public class PriceCalculator {
	public int getOrderPrice(Item item, ICoupon coupon) {
		if(coupon.isValid() && coupon.isAppliable(item)) {
			return (int)(item.getPrice()*getDiscountRate(coupon.getDiscountPercent()));
		}
		return item.getPrice();
	}
	private double getDiscountRate(int discountPercent) {
		return (100-discountPercent)/100d;
	}
}
