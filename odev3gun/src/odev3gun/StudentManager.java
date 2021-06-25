package odev3gun;

public class StudentManager extends UserManager{
	
	public static void add(User user) {
		System.out.println("Öðrenci " + user.getFirstName() + ";" + " eklendi.");
	}
	
	public static void delete(User user) {
		System.out.println("Öðrenci " + user.getFirstName() + ";" + " silindi.");
	}
}
