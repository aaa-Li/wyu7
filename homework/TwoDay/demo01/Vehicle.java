package demo01;

public class Vehicle {
	private String name;
	private double speed;
	private double size;
	public Vehicle(String name,double speed, double size) {
		System.out.println(name + "的速度为：" + speed + "，体积为：" + size);
	}
	
	public void speedUp() {
		System.out.println("加速！");
	}
	
	public void speedDown() {
		System.out.println("减速！");
	}
}
