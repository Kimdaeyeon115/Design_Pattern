package kr.ac.woosuk.testdouble;

public class StubCoupon implements ICoupon {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "VIP °í°´ ÇÑ°¡À§ °¨»çÄíÆù";
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getDiscountPercent() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public boolean isAppliable(Item item) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void doExpice() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void doExpire() throws Exception {
		// TODO Auto-generated method stub

	}

}
