package quiz_11_11;

public class StringTokenizer {

	public static void main(String[] args) {
		String data = "아이디,이름,패스워드";
		String[] arr = data.split(",");
		for(String token : arr) {
			System.out.print(token);
		}
	}

}
