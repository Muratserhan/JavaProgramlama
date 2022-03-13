package work3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Murat";
		Student student2 = new Student();
		student2.name = "Serhan";
		Instructor instructor = new Instructor();
		instructor.name = "Engin";

		UserManager userManager = new UserManager();
		userManager.countInstructor(instructor);
		userManager.request(new Student());

		User[] users = { student1, student2 };
		userManager.countToAllClass(users);

	}

}
