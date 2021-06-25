package odev3gun;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Rabia Aleyna");
		student.setLastName("Demir");
		student.setInternationalId("35600000000");
		student.setStudentNumber("64");
		student.setTakenCourses("Kurs1");
		
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Cihad");
		instructor.setLastName("Demirli");
		instructor.setInternationalId("10000000000");
		instructor.setGivenCourses("Kurs1");
		
		User user = new User();
		
		InstructorManager instructorManager = new InstructorManager();
		InstructorManager.add(instructor);
		System.out.println();
		instructorManager.delete(instructor);
		System.out.println("-------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		System.out.println();
		studentManager.delete(student);
		System.out.println("-------");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(user);
		System.out.println("-------");
	}

}
