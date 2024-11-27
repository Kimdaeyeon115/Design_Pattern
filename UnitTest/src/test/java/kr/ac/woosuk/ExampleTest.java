package kr.ac.woosuk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest {

	@Test
	void assertEquals_�׽�Ʈ() {
		assertEquals(4,1+3);
		assertEquals(3,1+2,"�μ��� ��");
		assertEquals("Hello World","Hello "+"World");
		assertEquals(0.3333, 1/3d, 0.0001);
	}
	@Test
	void assertSame_�׽�Ʈ() {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3=o1;
		
		assertSame(o1,o1,"�� ��ü ������ ��");
		assertNotSame(o1,o2,"�� ��ü �ٸ��� ��");
		assertSame(o1,o3,"�� ��ü ������ ��");
		
	}
	@Test
	void assertTrue_�׽�Ʈ() {
		double height =1.7;
		double weight =70.0;
		double BMI = weight / (height*height);
		
		assertTrue(BMI<25,"�� ������ ���� ���ǰ���");
		assertFalse(BMI>=25,"�� ������ ���� ���ǰ���");
		
	}
	@Test
	void assertNull_�׽�Ʈ() {
		Object o =null;
		assertNull(o,"�� ��Ȳ������ null�̾�� ��");
		o=new Object();
		assertNotNull(o,"�� ��Ȳ������ null�̸� �ȵ�");
		
	}
	@Test
	void fail_�׽�Ʈ() {
		Object o =new Object();
		fail("�׽�Ʈ�ó����� �ۼ� �ؾ���");
		
	}

}
