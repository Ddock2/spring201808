package aop_test;

public class Designer implements Employee {

	@Override
	public void work() {
		System.out.println("디자인을 합니다");
	}

	@Override
	public void info() {
		System.out.println("info()");		
	}
	
	
}
