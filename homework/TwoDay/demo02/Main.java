package demo02;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("����", 12);
		Person p2 = new Person("����", 18, "��");
		System.out.println("��������1��" + sum(1, 2));
		System.out.println("��������2��" + sum(1, 2, 3));
		System.out.println("��������3��" + sum(1.3, 2));
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
