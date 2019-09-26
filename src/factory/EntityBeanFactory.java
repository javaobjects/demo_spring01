package factory;

import domain.Person;

public class EntityBeanFactory {

	/**
	 * 
	 * <p>Title: getPerson</p>  
	 * <p>
	 *	Description: 
	 *  静态工厂方法实例化
	 * </p> 
	 * @return
	 */
//	public static Person getPerson() {
//		return new  Person();
//	}
	
	/**
	 * 
	 * <p>Title: getPerson</p>  
	 * <p>
	 *	Description: 
	 *  非静态工厂方法实例化
	 * </p> 
	 * @return
	 */
	public Person getPerson() {
		return new  Person();
	}
}
