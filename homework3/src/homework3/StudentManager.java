package homework3;

public class StudentManager {
	public void add(User user) {
		System.out.println("ögrenci bilgileri"+user.getFirstName() + user.getLastName() + user.getId() );
	}
	public void update (User user) {
		System.out.println("ögrenci bilgileri güncellendi");
	}
	public void delete(User user) {
		System.out.println("ögrenci silindi");
		
	}

}
