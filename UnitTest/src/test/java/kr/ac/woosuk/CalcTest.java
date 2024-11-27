package kr.ac.woosuk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class CalcTest {
	private Calc calc;
	
	@BeforeAll
	static void boforeAllMessage() {
		System.out.println("�׽�Ʈ ������. ���⿡�� Ŭ���� ��ü�� ������ ��ġ�� �������� ��");
	}
	@AfterAll
	static void afterAllMessage() {
		System.out.println("�׽�Ʈ �ͷ���. ����ִ� �������� �ݴ� ���� �ڵ尡 ��");
	}
	@BeforeEach
	void beforeEachTest() {
		this.calc=new Calc();
	}
	@AfterEach
	void afterEachTest() {
		System.out.println("�׽�Ʈ ���̽� ����.");
	}

	@Test
	void ���ϱ�_�׽�Ʈ() {

		assertEquals(3.0,calc.add(1.0, 2.0));
		assertEquals(7.26,calc.add(3.12, 4.14));
	}
	@Test
	void ����_�׽�Ʈ() {
		
		assertEquals(-1.0, calc.sub(1.0, 2.0));
		assertEquals(-1.40, calc.sub(1.123, 2.52));
	}
	@Test
	void ���ϱ�_�׽�Ʈ() {
		
		assertEquals(2.0,calc.mul(1.0, 2.0));
		assertEquals(2.31,calc.mul(1.1, 2.1));
	}
	@Test
	void ������_�׽�Ʈ() {
		
		assertEquals(0.5,calc.div(1.0, 2.0));
		assertEquals(0.33,calc.div(1.0, 3.0));
	}
	@Test
	void ������_�׽�Ʈ() {
		//Calc calc = new Calc();
		assertEquals(1.0,calc.rem(1.0, 2.0));
		assertEquals(2.0,calc.rem(10.0, 4.0));
	}
}
