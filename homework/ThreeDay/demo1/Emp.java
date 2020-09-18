package demo1;


import java.text.DateFormat;
import java.util.Date;

public class Emp {
	private String name;
	private int age;
	private String gender;
	private int salary; 
	private Date hiredate; //入职时间

	public Emp() {
		//无参构造
	}

	public Emp(String name, int age, String gender, int salary, Date hiredate) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		DateFormat df  = DateFormat.getDateInstance();
		return "姓名:" + this.name + ",年龄:" + this.age + ",性别:" + this.gender + ",薪资:" + this.salary + ",入职时间:"
				+ df.format(this.hiredate);
	}

	@Override
	public boolean equals(Object o) {
		Emp temp = (Emp) o;
		if(!this.name.equals(temp.name)) {
			return false;
		}else if(this.age!=temp.age) {
			return false;
		}else if(!this.gender.equals(temp.gender)) {
			return false;
		}else if(this.salary!=temp.salary) {
			return false;
		}
			
		return true;
	}

	public static void main(String[] args) {
		
	}
}
