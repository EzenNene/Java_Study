package quiz_09;

public class Q3_ActionExample {

	public static void main(String[] args) {
		Q3_Action action = new Q3_Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
			
		};
				
		action.work();
	}

}
