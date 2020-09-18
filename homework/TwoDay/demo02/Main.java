package demo02;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("张三", 12);
		Person p2 = new Person("李四", 18, "男");
		System.out.println("调用重载1：" + sum(1, 2));
		System.out.println("调用重载2：" + sum(1, 2, 3));
		System.out.println("调用重载3：" + sum(1.3, 2));
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	private static int sum(int a, int b, int c) {
		return a+b+c;
	}
	private static double sum(double a, int b) {
		return a+b;
	}
}
