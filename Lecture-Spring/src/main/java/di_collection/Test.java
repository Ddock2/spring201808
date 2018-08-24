package di_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	
	public Test() {
		System.out.println("Test() 호출...");
	}
	
	public Test(int i) {
		System.out.println("Test(int) 호출...");
	}
	
	public Test(String s) {
		System.out.println("Test(String) 호출...");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("di_collection.xml");
		
	}
	
}
