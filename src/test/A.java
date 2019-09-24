package test;

public class A {

	public A() {
		System.out.println("调用A的空构造方法");
	}
	
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
