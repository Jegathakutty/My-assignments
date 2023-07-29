package week2.day3assign;

public class Students {
public void getStudentInfo(int StudentID) {
	System.out.println("Enter the Student ID:");
}
	public void getStudentInfo(  String Studentname,int StudentID) {
		System.out.println("Enter the Student ID:");
		System.out.println("Enter the Student name:");
	}
	public void getStudentInfo(long Studentphone, String Studentemail) {
		System.out.println("Enter the Student phone no:");
		System.out.println("Enter the Student email:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Students record = new  Students();
		 record.getStudentInfo(345678);
		 record.getStudentInfo(7253004005l, "jegathakutty@gmail.com");
		 record.getStudentInfo("Jegatha", 345699);
	}

}
