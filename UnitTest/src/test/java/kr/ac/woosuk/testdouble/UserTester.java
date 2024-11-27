package kr.ac.woosuk.testdouble;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.*;

class UserTester {

	@Test
	void 테스트스파이를_이용한_쿠폰추가_테스트() {
		//준비
		PriceCalculator calculator = new PriceCalculator();
		ICoupon coupon = new SpyCoupon();
		
		//동작쿠폰 할인 적용
		Item item = new Item("LightSavor", "부엌칼",100000);
		int price = calculator.getOrderPrice(item, coupon);
		
		//확인
		assertEquals(93000,price);
		assertEquals(1,((SpyCoupon)coupon).getIsAppliableCallCnt());
	}
	
	}
		
		/*
		//동작 - 쿠폰할인 미적용
		Item item2 = new Item("R2D2", "알람시계",20000);
		int price2 = calculator.getOrderPrice(item2, coupon);
		
		//확인
		assertEquals(20000,price2);
	}*/
