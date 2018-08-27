package aop_basic;

public class AOPMain {
	
	public static void main(String[] args) {
		
		Girl girl = new Girl();
		Boy boy = new Boy();
		
		girl.runSomething();
		boy.runSomething();
		
	}
	
}
