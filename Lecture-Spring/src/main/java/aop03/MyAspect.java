package aop03;

import javax.annotation.processing.ProcessingEnvironment;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect {
	
//	@After("execution(* setAge(..))")
	public void checkAdult(JoinPoint joinPoint) {
		
		Object[] args = joinPoint.getArgs();
		Object target = joinPoint.getTarget();
		System.out.println(target);
		
		int age = (Integer)args[0];
		
		if(age>=20) {
			System.out.println("성년입니다");
		}else {
			System.out.println("미성년입니다");
		}
	}
	
	@Around("execution(* setAge(..))")
	public Object checkAdult2(ProceedingJoinPoint joinPoint) throws Throwable{
		
		Object retVal = joinPoint.proceed();
		Object obj = joinPoint.getTarget();
		
		if(obj instanceof Man) {
			Man man = (Man)obj;
			int age = man.getAge();
			
			if(age>=20) {
				System.out.println("성년입니다");
			}else {
				System.out.println("미성년입니다");
			}
		}
		
		return retVal;
	}
}
