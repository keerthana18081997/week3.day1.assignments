package week3assignments;

public class Students {
	public void studentinfo(int a) {
		System.out.println( " id = "+a);
	}
public void studentinfo(String name) {
	System.out.println("name = " + name);
}
public void studentinfo(long phonenumber , String email) {
	System.out.println("phone number = " + phonenumber + "email = " + email);
}
public static void main(String[] args) {
	Students obj=new Students();
	obj.studentinfo(12);
	obj.studentinfo("keerthana");
	obj.studentinfo( 585241525 , "keerthanaravichandra@gmail.com");
}
}
