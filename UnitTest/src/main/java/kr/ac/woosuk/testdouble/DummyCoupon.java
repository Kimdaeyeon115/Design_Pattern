package kr.ac.woosuk.testdouble;

public class DummyCoupon implements ICoupon {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDiscountPercent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAppliable(Item item) {
		// TODO Auto-generated method stub
		return false;
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
