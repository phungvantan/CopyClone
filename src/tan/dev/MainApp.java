package tan.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student std1 = new Student("Tan", 19, "Phu Mau", "0123456789", 9.0);
			Student std2 = (Student) std1.clone();
			System.out.println(std1.toString());
			System.out.println(std2.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}


