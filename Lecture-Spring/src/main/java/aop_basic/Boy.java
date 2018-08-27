package aop_basic;

public class Boy {
	
	public void runSomething() {
		
		MyAspect.beforeRunSonmething();
		System.out.println("컴퓨터 게임을 합니다");
		MyAspect.afterRunSonmething();
		
	}
}
