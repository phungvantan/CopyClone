package tan.dev;

public class Student implements Cloneable {
	String name;
	int age;
	String address;
	String phoneNumber;
	double diemTB;
	public Student(String name, int age, String address, String phoneNumber, double diemTB) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.diemTB = diemTB;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [Name=" + name + ", Age=" + age + ", ddress= " + address + ", PhoneNumber=+" + phoneNumber + ", diemTB=+" + diemTB + "]";
	}
	
}