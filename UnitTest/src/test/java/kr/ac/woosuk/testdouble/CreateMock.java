package kr.ac.woosuk.testdouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class CreateMock {
	@Test
	void Mock��ü��_�̿���_�����߰�_�׽�Ʈ() {
		//�غ�
		User user = new User("test11");
		assertEquals(0,user.getTotalCouponCount());
		
		//�������� ���� ����
		ICoupon coupon =Mockito.mock(ICoupon.class);
		user.addCoupon(coupon);
		
		//Ȯ��
		assertEquals(1,user.getTotalCouponCount());
	}
}
