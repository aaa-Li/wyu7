package demo02;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	
	public Person(String name, int age) {
		System.out.println("构造方法1：姓名是：" + name + "，年龄是：" + age);
	}
	
	public Person(String name, int age, String gender) {
		System.out.println("构造方法2：姓名是：" + name + "，年龄是：" + age + "，性别是：" + gender);
	}
	
}
