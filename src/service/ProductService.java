package service;

import dao.ProductDao;
import domain.Product;

public class ProductService {

	/**
	 * 演示ProductService的生命周期，
	 * 所以定义如下方法
	 */
	public ProductService() {
		System.out.println("productService 的构造方法");
	}
	
	public void chushihua() {
		System.out.println("ProductService初始化方法");
	}
	
	public void destory() {
		System.out.println("ProductService的销毁方法");
	}
	
	private ProductDao productDao;
	
	public void ruku(Product pro) {
		System.out.println("into ruku().....");
		productDao.addProduct(pro);
	}

	public ProductDao getProductDao() {
		System.out.println("getProductDao()");
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		System.out.println("setProductDao()");
		this.productDao = productDao;
	}
	
}
