package dao;

import domain.Product;

public class ProductDao {

	public ProductDao() {
		System.out.println("productDao 的构造方法。。。。。");
	}
	
	public void addProduct(Product pro) {
		System.out.println("add product");
	}
}
