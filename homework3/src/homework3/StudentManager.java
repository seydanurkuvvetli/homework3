package homework3;

public class StudentManager {
	public void add(User user) {
		System.out.println("��renci bilgileri"+user.getFirstName() + user.getLastName() + user.getId() );
	}
	public void update (User user) {
		System.out.println("��renci bilgileri g�ncellendi");
	}
	public void delete(User user) {
		System.out.println("��renci silindi");
		
	}

}
