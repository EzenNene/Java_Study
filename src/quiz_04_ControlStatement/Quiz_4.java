package quiz_04_ControlStatement;

public class Quiz_4 {

	public static void main(String[] args) {
		while(true) {
			int num1 = (int) (Math.random()*6) + 1;
			int num2 = (int) (Math.random()*6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if ((num1 + num2) == 5) {
				break;
				
				// 위부터 코드가 내려오는 순서에 주목
			}
			
		}
	}

}
