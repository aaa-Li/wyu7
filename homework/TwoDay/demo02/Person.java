package demo02;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	
	public Person(String name, int age) {
		System.out.println("���췽��1�������ǣ�" + name + "�������ǣ�" + age);
	}
	
	public Person(String name, int age, String gender) {
		System.out.println("���췽��2�������ǣ�" + name + "�������ǣ�" + age + "���Ա��ǣ�" + gender);
	}
	
}
