package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBeanFactoryAndApplicationContext {

	public static void main(String[] args) {
		
		/**
		 * 1. BeanFactory
		 */
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		
//		A a = (A)factory.getBean("a");
//		
//		a.sayHello("sunyanchun");
		
		//2.applicationContext
		//①文件放在硬盘目录下，怎么读取？
		
		//ApplicationContext act=new FileSystemXmlApplicationContext("file:d:\\applicationContext.xml");
		//②文件放在项目目录下
		//ApplicationContext act=new FileSystemXmlApplicationContext("file:config\\applicationContext.xml");
		//③文件放在类路径下
		//ApplicationContext act=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		//④很多个beans.xml文件如何读取
		ApplicationContext act = new FileSystemXmlApplicationContext(
				new String[]{"classpath:applicationContext.xml","classpath:beans-order.xml"});
		
		C c = (C) act.getBean("cc");
		c.print("haogen");
		//A a=act.getBean(test.A.class);
		
		
		//a.sayHello("likaiqing");
	}
}
