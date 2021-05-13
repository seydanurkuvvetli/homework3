package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println("User added! " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("User updated! " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("User deleted! " + user.getFirstName() + " " + user.getLastName());
	}

}
