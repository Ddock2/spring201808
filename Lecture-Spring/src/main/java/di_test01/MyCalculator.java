package di_test01;

public class MyCalculator {
	
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	
	public MyCalculator() {
		
	}
	
	public MyCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}	
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	public void sub() {
		calculator.subtract(firstNum, secondNum);
	}	
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}	
	public void div() {
		calculator.divide(firstNum, secondNum);
	}
}
