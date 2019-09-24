package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		BeanFactory beanf;
		

		/**
		 * 使用BeanFactory实例化spring容器
		 * 尽可能晚的初始化所有bean,节省内存
		 * 生产环境这样做
		 */
//		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/**
		 * 源码:spring-context-4.1.7.RELEASE-sources.jar
		 * 使用ClassPathXmlApplicationContext实例化spring容器
		 * 容器初始化时初始化所有bean，消耗内存
		 * 开发时这样做，即时暴露问题
		 */
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		BeanFactory act2 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
//		A a = new A();
		A a = (A) act.getBean("a");
		
		a.sayHello("liyiqiang");
	}
}
