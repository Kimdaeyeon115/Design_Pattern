package kr.ac.woosuk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegisterTester {

	@Test
	void 비밀번호_저장_테스트() {
		//준비
		UserRegister register =new UserRegister();
		Cipher cipher =new  CipherMock();
		String userId="admin";
		String password="1111";
		
		//동작
		//사용자 아이디와 비밀번호를 저장한다
		register.savePassword(userId, cipher.encrypt(password));
		//사용자 아이디를 이용하여 비밀번호를 가져온다
		String result =cipher.decrypt(register.getPassword(userId));
		
		//확인
		assertEquals(password, result);
	}

}
