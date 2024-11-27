package kr.ac.woosuk.testdouble;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.io.PrintStream;
import java.awt.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import kr.ac.woosuk.Calc; 

class UserMockitoTester {

	@Test
	void Mock객체만들기_테스트() {
		//준비
		ICoupon coupon =Mockito.mock(ICoupon.class);
		Item item =new Item("LightSavor","부엌칼",100000);
		System.out.println(coupon.getName());
		System.out.println(coupon.isValid());
		System.out.println(coupon.isAppliable(item));
		System.out.println(coupon.getDiscountPercent());
		
		//동작-쿠폰할인 적용
		
	}
	@Test
	void Mock객체를_이용한_획득_쿠폰_테스트() {
		User user =new User("test11");
		ICoupon eventCoupon = Mockito.mock(ICoupon.class);
		Mockito.when(eventCoupon.getDiscountPercent()).thenReturn(7);
		Mockito.when(eventCoupon.getName()).thenReturn("VIP 고객 한가위 감사쿠폰");
		
		user.addCoupon(eventCoupon);
		ICoupon coupon = user.getLastOccupiedcoupon();
		
		assertEquals(7,coupon.getDiscountPercent(),"쿠폰 할인율");
		assertEquals("VIP 고객 한가위 감사쿠폰",coupon.getName());
		}

		
	@Test
	void Mock_행위기반_테스트() {
	List mockedList = Mockito.mock(List.class);
	
	mockedList.add("test");
	
	Mockito.verify(mockedList).add("test");
	
	mockedList.add("a");
	mockedList.add("a");
	mockedList.add("a");
	
	Mockito.verify(mockedList,Mockito.times(3)).add("a");
	}
	
	@Test
	void Mock객체이용한_제품_할인_계산_테스트() {
		//준비
		PriceCalculator calculator = new PriceCalculator();
		Item item = new Item("LightSavor","부엌칼",100000);
		ICoupon coupon =Mockito.mock(ICoupon.class);
		Mockito.when(coupon.getDiscountPercent()).thenReturn(7);
		Mockito.when(coupon.getName()).thenReturn("VIP 고객 한가위 감사쿠폰");
		Mockito.when(coupon.isValid()).thenReturn(true);
		Mockito.when(coupon.isAppliable(item)).thenReturn(true);
		
		//동작-쿠폰할인 적용
		int price = calculator.getOrderPrice(item, coupon);
		
		assertEquals(93000,price);
		Mockito.verify(coupon,Mockito.times(1)).isAppliable(item);
	}
	
	@Test
	void 화면출력_테스트() {
		Calc calc = new Calc();
		PrintStream mockedPrintStream = Mockito.mock(PrintStream.class);
		System.setOut(mockedPrintStream);
		
		calc.display();
		
		Mockito.verify(mockedPrintStream).println("hello world");
	}
}
