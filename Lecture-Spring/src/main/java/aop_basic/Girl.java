package aop_basic;

public class Girl {
	
	public void runSomething() {
		
		MyAspect.beforeRunSonmething();
		System.out.println("화장을 지운다");
		MyAspect.afterRunSonmething();
		
	}
	
}
