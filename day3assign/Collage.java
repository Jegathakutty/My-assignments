package week2.day3assign;

public class Collage extends Department{
	public void CollageName() {
		System.out.println("Enter your collage name:");
	}
	
	public void CollageCode() {
		System.out.println("Enter your collage code:");
		
	}
	public void CollageRank() {
		System.out.println("Enter your collage rank:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collage COL = new Collage();
		COL.CollageName();
		COL.CollageCode();
		COL.CollageRank();
		COL.DepName();
		COL.StudentName();
		COL.StudentID();
		COL.StudentDept();
	}

}
