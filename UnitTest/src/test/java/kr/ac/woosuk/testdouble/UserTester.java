package kr.ac.woosuk.testdouble;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.*;

class UserTester {

	@Test
	void �׽�Ʈ�����̸�_�̿���_�����߰�_�׽�Ʈ() {
		//�غ�
		PriceCalculator calculator = new PriceCalculator();
		ICoupon coupon = new SpyCoupon();
		
		//�������� ���� ����
		Item item = new Item("LightSavor", "�ξ�Į",100000);
		int price = calculator.getOrderPrice(item, coupon);
		
		//Ȯ��
		assertEquals(93000,price);
		assertEquals(1,((SpyCoupon)coupon).getIsAppliableCallCnt());
	}
	
	}
		
		/*
		//���� - �������� ������
		Item item2 = new Item("R2D2", "�˶��ð�",20000);
		int price2 = calculator.getOrderPrice(item2, coupon);
		
		//Ȯ��
		assertEquals(20000,price2);
	}*/
