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
	void Mock��ü�����_�׽�Ʈ() {
		//�غ�
		ICoupon coupon =Mockito.mock(ICoupon.class);
		Item item =new Item("LightSavor","�ξ�Į",100000);
		System.out.println(coupon.getName());
		System.out.println(coupon.isValid());
		System.out.println(coupon.isAppliable(item));
		System.out.println(coupon.getDiscountPercent());
		
		//����-�������� ����
		
	}
	@Test
	void Mock��ü��_�̿���_ȹ��_����_�׽�Ʈ() {
		User user =new User("test11");
		ICoupon eventCoupon = Mockito.mock(ICoupon.class);
		Mockito.when(eventCoupon.getDiscountPercent()).thenReturn(7);
		Mockito.when(eventCoupon.getName()).thenReturn("VIP �� �Ѱ��� ��������");
		
		user.addCoupon(eventCoupon);
		ICoupon coupon = user.getLastOccupiedcoupon();
		
		assertEquals(7,coupon.getDiscountPercent(),"���� ������");
		assertEquals("VIP �� �Ѱ��� ��������",coupon.getName());
		}

		
	@Test
	void Mock_�������_�׽�Ʈ() {
	List mockedList = Mockito.mock(List.class);
	
	mockedList.add("test");
	
	Mockito.verify(mockedList).add("test");
	
	mockedList.add("a");
	mockedList.add("a");
	mockedList.add("a");
	
	Mockito.verify(mockedList,Mockito.times(3)).add("a");
	}
	
	@Test
	void Mock��ü�̿���_��ǰ_����_���_�׽�Ʈ() {
		//�غ�
		PriceCalculator calculator = new PriceCalculator();
		Item item = new Item("LightSavor","�ξ�Į",100000);
		ICoupon coupon =Mockito.mock(ICoupon.class);
		Mockito.when(coupon.getDiscountPercent()).thenReturn(7);
		Mockito.when(coupon.getName()).thenReturn("VIP �� �Ѱ��� ��������");
		Mockito.when(coupon.isValid()).thenReturn(true);
		Mockito.when(coupon.isAppliable(item)).thenReturn(true);
		
		//����-�������� ����
		int price = calculator.getOrderPrice(item, coupon);
		
		assertEquals(93000,price);
		Mockito.verify(coupon,Mockito.times(1)).isAppliable(item);
	}
	
	@Test
	void ȭ�����_�׽�Ʈ() {
		Calc calc = new Calc();
		PrintStream mockedPrintStream = Mockito.mock(PrintStream.class);
		System.setOut(mockedPrintStream);
		
		calc.display();
		
		Mockito.verify(mockedPrintStream).println("hello world");
	}
}
