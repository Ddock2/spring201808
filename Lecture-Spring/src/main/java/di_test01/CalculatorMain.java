package di_test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di_test01.xml");
		
		System.out.println("---Constructor Injection---");
		MyCalculator myCalc = (MyCalculator) context.getBean("myCalc");
		
//		myCalc.setFirstNum(10);
//		myCalc.setSecondNum(3);
		
		myCalc.add();
		myCalc.sub();
		myCalc.mul();
		myCalc.div();
		
		
		System.out.println();
		
		
		System.out.println("---Setter Injection---");
		MyCalculator myCalc2 = context.getBean("myCalc2", MyCalculator.class);
//		myCalc2.setFirstNum(10);
//		myCalc2.setSecondNum(3);
		
		myCalc2.add();
		myCalc2.sub();
		myCalc2.mul();
		myCalc2.div();
		
	}

}
