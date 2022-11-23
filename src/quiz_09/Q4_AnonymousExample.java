package quiz_09;

public class Q4_AnonymousExample {

	public static void main(String[] args) {
		Q4_Anonymous anony = new Q4_Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Q4_Vehicle() {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다");
			}
			
		});
		
		
		
	}

}
