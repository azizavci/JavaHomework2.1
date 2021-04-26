
public class UserManager {

	
	public void listUser(User user) {

		System.out.println("KULLANICI BÝLGÝLERÝ");
		
		System.out.println("KULLANICI ID :"+user.id);
		System.out.println("KULLANICI AD :"+user.firstName);
		System.out.println("KULLANICI SOYAD :"+user.lastName);
		System.out.println("KULLANICI EMAIL :"+user.eMail);
		System.out.println("KULLANICI PAROLA :"+user.password);
		
		System.out.println("--------------------------------");
		
	}
	
	public void add(User user) {		
	
		System.out.println(user.firstName+" kullanýcýsý eklendi!");
		
		listUser(user);
		

		
		
	}
	
	public void changePassword(User user,String password) {
		
		user.password=password;
		
		listUser(user);
		
		System.out.println("parola deðiþtirildi.Yeni parola :"+password);
		
	}
	
}
