# spring

1. spring jar包导入

```Java
导入如下包并添加到内路径
spring-beans-4.1.7.RELEASE.jar
spring-context-4.1.7.RELEASE.jar
spring-core-4.1.7.RELEASE.jar
spring-expression-4.1.7.RELEASE.jar
spring-test-4.1.7.RELEASE.jar
commons-logging-1.1.3.jar
```

2. spring的配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context" 
       xmlns:aop="http://www.springframework.org/schema/aop"      
       xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
           http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-2.5.xsd
           http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-2.5.xsd">

	<bean id="a" class="test.A">
		<property name="c3" ref="c"></property>
	</bean>
	<bean id="c" class="test.C">
	</bean>
	
</beans>
```
3. 为依赖的属性提供get/set方法

```Java
package test;

public class A {

	private B b3 = new B();//class A 依赖 class B 依赖的属性一定要实例化
//	B b3;//class A 依赖 class B
	private C c3;
	
	
	public C getC3() {
		return c3;
	}

	public void setC3(C c3) {
		this.c3 = c3;
	}

	public int add(String a,String b) {
		int c = 0;
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		return b3.add(a1, b1);
	}
	
	public void sayHello(String username) {
		c3.print(username);
	}
	
	public static void main(String[] args) {
		System.out.println(new A().add("12","13"));
	}
}
```

```Java
package test;

public class C {

	public void print(String name) {
		System.out.println("hello," + name);
	}
}
```

4. 测试

```Java
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
```

**测试结果:**

```
hello,liyiqiang
```

#### 拓展

[spring源码仓库链接](https://repo.spring.io/release/org/springframework/spring/)

