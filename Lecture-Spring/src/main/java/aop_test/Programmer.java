package aop_test;

public class Programmer implements Employee {

	@Override
	public void work() {
		System.out.println("개발을 합니다");
	}
	
	@Override
	public void info() {
		System.out.println("info()");		
	}
}
