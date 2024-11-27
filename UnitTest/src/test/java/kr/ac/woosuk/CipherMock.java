package kr.ac.woosuk;

public class CipherMock implements Cipher{
	@Override
	public String encrypt(String source) {
		return source;
	}
	@Override
	public String decrypt(String source) {
		return source;
	}
}