package quiz_03;

public class Quiz_3 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
	}

}
