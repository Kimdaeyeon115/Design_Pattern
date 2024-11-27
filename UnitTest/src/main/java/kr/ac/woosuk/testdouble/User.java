package kr.ac.woosuk.testdouble;
import java.util.ArrayList;
import java.util.List;
public class User {
	private String id;
	private List<ICoupon> coupons;
	
	public User(String id) {
		this.id=id;
		this.coupons=new ArrayList<ICoupon>();
	}
	public Integer getTotalCouponCount() {
		return this.coupons.size();
	}
	public void addCoupon(ICoupon coupon) {
		this.coupons.add(coupon);
	}
	public ICoupon getLastOccupiedcoupon() {
		if(this.coupons.size()==0) {
			return null;
		}
		return this.coupons.get(this.coupons.size()-1);
	}
}
