package odev3_2;

public class UserManager {

	public void add(User user) {
		
		System.out.println(user.getFirstName()+" kullanýcýsý eklendi!");
		
	}
	
	public void multipleAdd(User[] users) {
		
		for (User user : users) {
			
			this.add(user);
			
		}
		
	}
	
	public void login() {
		
	}
		
}
