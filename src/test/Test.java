package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		/**
		 * 源码:spring-context-4.1.7.RELEASE-sources.jar
		 */
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		A a = new A();
		A a = (A) act.getBean("a");
		
		a.sayHello("liyiqiang");
	}
}
