package kr.ac.woosuk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest {

	@Test
	void assertEquals_테스트() {
		assertEquals(4,1+3);
		assertEquals(3,1+2,"두수의 합");
		assertEquals("Hello World","Hello "+"World");
		assertEquals(0.3333, 1/3d, 0.0001);
	}
	@Test
	void assertSame_테스트() {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3=o1;
		
		assertSame(o1,o1,"두 객체 같은지 비교");
		assertNotSame(o1,o2,"두 객체 다른지 비교");
		assertSame(o1,o3,"두 객체 같은지 비교");
		
	}
	@Test
	void assertTrue_테스트() {
		double height =1.7;
		double weight =70.0;
		double BMI = weight / (height*height);
		
		assertTrue(BMI<25,"비만 판정을 위한 조건검증");
		assertFalse(BMI>=25,"비만 판정을 위한 조건검증");
		
	}
	@Test
	void assertNull_테스트() {
		Object o =null;
		assertNull(o,"이 상황에서는 null이어야 함");
		o=new Object();
		assertNotNull(o,"이 상황에서는 null이면 안됨");
		
	}
	@Test
	void fail_테스트() {
		Object o =new Object();
		fail("테스트시나리오 작성 해야함");
		
	}

}
