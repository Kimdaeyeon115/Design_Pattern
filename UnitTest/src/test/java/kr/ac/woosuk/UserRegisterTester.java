package kr.ac.woosuk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegisterTester {

	@Test
	void ��й�ȣ_����_�׽�Ʈ() {
		//�غ�
		UserRegister register =new UserRegister();
		Cipher cipher =new  CipherMock();
		String userId="admin";
		String password="1111";
		
		//����
		//����� ���̵�� ��й�ȣ�� �����Ѵ�
		register.savePassword(userId, cipher.encrypt(password));
		//����� ���̵� �̿��Ͽ� ��й�ȣ�� �����´�
		String result =cipher.decrypt(register.getPassword(userId));
		
		//Ȯ��
		assertEquals(password, result);
	}

}
