package kr.ac.woosuk.testdouble;

import java.util.ArrayList;
import java.util.List;

public class SpyCoupon implements ICoupon {
	private List<String> categoryList;
	private int isAppLiableCallcnt;
	
	public SpyCoupon() {
		this.categoryList=new ArrayList<String>();
		this.isAppLiableCallcnt=0;
		this.categoryList.add("�ξ�Į");
		this.categoryList.add("�Ƶ� �峭��");
		this.categoryList.add("�����ⱸ");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "VIP �� �Ѱ��� ��������";
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
		this.isAppLiableCallcnt++;
		if(this.categoryList.contains(item.getCategory())) {
			return true;
		}
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
	
	public int getIsAppliableCallCnt() {
		return this.isAppLiableCallcnt;
	}

}
