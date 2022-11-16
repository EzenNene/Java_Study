package quiz_06_Class;

import java.util.Scanner;

public class Quiz_15 {

	public class MemberService {
		
		public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String id = scanner.nextLine();
		
		boolean login(String id, String password) {
			if (id.equals("hong") && password.equals("12345")) {
				return true;	
			} else {
				return false;
			}
		}
		
		void logout(String id) {
			System.out.println(id + "님이 로그아웃 되었습니다");
		}
		
		
		}
	}
	
}
