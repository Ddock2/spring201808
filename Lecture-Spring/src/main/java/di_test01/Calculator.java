package di_test01;

public class Calculator {
	
	public void addition(int firstNum, int secondNum) {
		System.out.println("덧셈결과 : " + firstNum + "+" + secondNum + " = " + (firstNum+secondNum));
	}
	
	public void subtract(int firstNum, int secondNum) {
		System.out.println("뺄셈결과 : " + firstNum + "-" + secondNum + " = " + (firstNum-secondNum));
	}
	
	public void multiplication(int firstNum, int secondNum) {
		System.out.println("곱셈결과 : " + firstNum + "x" + secondNum + " = " + (firstNum*secondNum));
	}
	
	public void divide(int firstNum, int secondNum) {
		System.out.println("나눗셈결과 : " + firstNum + "÷" + secondNum + " = " + (firstNum/secondNum));
	}
	
}
