package demo01;

public class Vehicle {
	private String name;
	private double speed;
	private double size;
	public Vehicle(String name,double speed, double size) {
		System.out.println(name + "���ٶ�Ϊ��" + speed + "�����Ϊ��" + size);
	}
	
	public void speedUp() {
		System.out.println("���٣�");
	}
	
	public void speedDown() {
		System.out.println("���٣�");
	}
}
