package odev3gun;

public class InstructorManager extends UserManager{
	
	public static void add(User user) {
		System.out.println("E�itmen " + user.getFirstName() + ";" + " eklendi.");
	}
	
	public static void delete(User user) {
		System.out.println("E�itmen " + user.getFirstName() + ";" + " silindi.");
	}
}
