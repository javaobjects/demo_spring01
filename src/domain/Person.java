package domain;

public class Person {

	private Integer id;
	private String name;
	
	public Person() {
		super();
		System.out.println("person的构造方法");
	}
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
