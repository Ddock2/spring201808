package aop_basic;

public class MyAspect {
	
	public static void beforeRunSonmething() {
		System.out.println("열쇠로 문을 열고 집에 들어옵니다");
	}
	public static void afterRunSonmething() {
		System.out.println("불을 끄고 잠을 잡니다");
	}
	
}
