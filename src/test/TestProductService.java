package test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import service.ProductService;

public class TestProductService {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext act = new FileSystemXmlApplicationContext(
				new String[]{"classpath:applicationContext.xml"});
		
		ProductService service1 = (ProductService)act.getBean("productService");
		ProductService service2 = (ProductService)act.getBean("productService");
		ProductService service3 = (ProductService)act.getBean("productService");
		
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service3);
		
//		service.ruku(new Product());
		
//		service.destory();
	}
}
