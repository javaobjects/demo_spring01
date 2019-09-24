package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		A a = new A();
		A a = (A) act.getBean("a");
		
		a.sayHello("liyiqiang");
	}
}
