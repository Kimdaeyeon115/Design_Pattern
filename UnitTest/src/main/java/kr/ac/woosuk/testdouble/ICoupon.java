package kr.ac.woosuk.testdouble;

public interface ICoupon {
	public String getName();
	public boolean isValid();
	public int getDiscountPercent();
	public boolean isAppliable(Item item);
	public void doExpice() throws Exception;
	void doExpire() throws Exception;
}
