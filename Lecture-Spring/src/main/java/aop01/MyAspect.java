package aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Before("execution(void aop01.Girl.runSomething())")	// join시점 설정
	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집으로 들어옵니다");
	}
	
	@After("execution(* runSomething())")
	public void after(JoinPoint joinPoint) {
		System.out.println("불을 끄고 잠을 잡니다");
	}
	
	@Around("execution(* runSomething())")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("불을 켭니다");
		joinPoint.proceed();						//runSomething() 수행 코드
		System.out.println("문단속을 합니다");
	}
/*
	@Pointcut("execution(* runSomething())")
	public void pointCut() {
		
	}
	
	@Before("pointCut()")	// join시점 설정
	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집으로 들어옵니다");
	}
	
	@After("pointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("불을 끄고 잠을 잡니다");
	}
*/
}
