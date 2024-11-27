package kr.ac.woosuk;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calc {
	public double add(double num1,double num2) {
		BigDecimal b1 =new BigDecimal(num1);
		BigDecimal b2 =new BigDecimal(num2);
		b1 = b1.setScale(2,RoundingMode.HALF_UP);
		b2 = b2.setScale(2,RoundingMode.HALF_UP);
		return b1.add(b2).doubleValue();
	}
	public double sub(double num1,double num2) {
		return num1-num2;
	}
	public double mul(double num1,double num2) {
		return num1*num2;
	}
	public double rem(double num1,double num2) {
		return num1%num2;
	}
	public double div(double num1,double num2) {
		return num1/num2;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}
}
