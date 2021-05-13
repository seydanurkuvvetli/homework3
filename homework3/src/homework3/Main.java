package homework3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("şeydanur");
		student1.setLastName("kuvvetli");
		student1.setId(1);
		student1.setPassword("1234");
		student1.setEmail("seyda@hotmail.com");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.update(student1);
		studentManager.delete(student1);
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.add(instructor1);
		
	}

}
