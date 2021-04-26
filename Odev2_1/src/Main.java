
public class Main {

	public static void main(String[] args) {

		// User reference
		
		User user1=new User();
		user1.id=1;
		user1.firstName="aziz";
		user1.lastName="avcý";
		user1.eMail="aziz@avci.com";
		user1.password="aziz1234";
		
		
		UserManager userManager=new UserManager();
		userManager.add(user1);
		userManager.changePassword(user1, "avci1234");
		
		
		
		//Course references
		
		Course course1=new Course();
		course1.id=1;
		course1.courseName="C#";
		course1.teacher="ENGÝN DEMÝROÐ";
		course1.detail="SIFIRDAN SEKTÖRÜN YÜKSEKLERÝNE";
		
		Course course2=new Course();
		course2.id=2;
		course2.courseName="JAVA";
		course2.teacher="ENGÝN DEMÝROÐ";
		course2.detail="JAVA+REACT";
		
		Course course3=new Course(3,"TEMEL KURS","ENGÝN DEMÝROÐ","PROGRAMLAMAYA GÝRÝÞ");
		CourseManager courseManager=new CourseManager();
		
		Course[] courses={
			
				course1,
				course2,
				course3
				
		};
		
		
		for (Course course : courses) {
			
			courseManager.add(course);
		}
		
	}

}
