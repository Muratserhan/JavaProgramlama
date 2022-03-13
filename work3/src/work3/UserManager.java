package work3;

public class UserManager {
	public void count(User user) {
		System.out.println(user.name + " Burada");
	}

	public void countInstructor(Instructor instructor) {
		System.out.println("Hocamiz " + instructor.name + " Burada");
	}

	public void request(User user) {
		user.attenceList();
	}

	public void countToAllClass(User[] users) {
		for (User user : users) {
			count(user);

		}

	}
}
