package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBeanFactoryAndApplicationContext {

	public static void main(String[] args) {
		
		/**
		 * 1. BeanFactory
		 */
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		A a = (A)factory.getBean("a");
		
		a.sayHello("sunyanchun");
	}
}
