package kr.ac.woosuk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class CalcTest {
	private Calc calc;
	
	@BeforeAll
	static void boforeAllMessage() {
		System.out.println("테스트 시작전. 여기에는 클래스 전체에 영향을 미치는 설정등이 들어감");
	}
	@AfterAll
	static void afterAllMessage() {
		System.out.println("테스트 와료후. 여기애는 설정등을 닫는 등의 코드가 들어감");
	}
	@BeforeEach
	void beforeEachTest() {
		this.calc=new Calc();
	}
	@AfterEach
	void afterEachTest() {
		System.out.println("테스트 케이스 종료.");
	}

	@Test
	void 더하기_테스트() {

		assertEquals(3.0,calc.add(1.0, 2.0));
		assertEquals(7.26,calc.add(3.12, 4.14));
	}
	@Test
	void 뻬기_테스트() {
		
		assertEquals(-1.0, calc.sub(1.0, 2.0));
		assertEquals(-1.40, calc.sub(1.123, 2.52));
	}
	@Test
	void 곱하기_테스트() {
		
		assertEquals(2.0,calc.mul(1.0, 2.0));
		assertEquals(2.31,calc.mul(1.1, 2.1));
	}
	@Test
	void 나누기_테스트() {
		
		assertEquals(0.5,calc.div(1.0, 2.0));
		assertEquals(0.33,calc.div(1.0, 3.0));
	}
	@Test
	void 나머지_테스트() {
		//Calc calc = new Calc();
		assertEquals(1.0,calc.rem(1.0, 2.0));
		assertEquals(2.0,calc.rem(10.0, 4.0));
	}
}
