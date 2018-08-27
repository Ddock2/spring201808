package aop03;

import org.springframework.stereotype.Component;

@Component
public class Man implements Human {
	
	private int age;
	
	@Override
	public void setAge(int age) {
		this.age = age;
		System.out.println("age : " + age);
	}

	public int getAge() {
		return age;
	}	

}
