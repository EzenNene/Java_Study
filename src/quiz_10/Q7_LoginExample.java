package quiz_10;

public class Q7_LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) { // Exception e = new Q7_NotExistIDException("아이디가 존재하지 않습니다")
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws Q7_NotExistIDException, Q7_WrongPasswordException {
		//id가 blue가 아니라면 NotExistIDException을 발생시킴
		if(!id.equals("blue")) {
			throw new Q7_NotExistIDException("아이디가 존재하지 않습니다");
		}
		
		if(!password.equals("12345")) {
			throw new Q7_WrongPasswordException("패스워드가 틀립니다");
		}
		
		
	}
}
