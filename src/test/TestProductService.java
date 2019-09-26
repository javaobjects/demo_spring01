package test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import domain.Product;
import service.ProductService;

public class TestProductService {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext act = new FileSystemXmlApplicationContext(
				new String[]{"classpath:applicationContext.xml"});
		
		ProductService service = (ProductService)act.getBean("productService");
		
		service.ruku(new Product());
		
		service.destory();
	}
}
