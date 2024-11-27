
public class Calc {
	public double add(double num1,double num2) {
		return num1+num2;
	}
	public double sub(double num1,double num2) {
		return num1-num2;
	}
	public double mul(double num1,double num2) {
		return num1*num2;
	}
	public double rem(double num1,double num2) {
		return num1/num2;
	}
	public static void main(String arg[]) {
		Calc calc=new Calc();
		System.out.println(calc.add(1.1, 1.2));
	}
	
	public void display() {
		System.out.println("hello word");
	}
}
