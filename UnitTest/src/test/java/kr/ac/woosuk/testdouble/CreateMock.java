package kr.ac.woosuk.testdouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class CreateMock {
	@Test
	void Mock객체를_이용한_쿠폰추가_테스트() {
		//준비
		User user = new User("test11");
		assertEquals(0,user.getTotalCouponCount());
		
		//동작쿠폰 할인 적용
		ICoupon coupon =Mockito.mock(ICoupon.class);
		user.addCoupon(coupon);
		
		//확인
		assertEquals(1,user.getTotalCouponCount());
	}
}
