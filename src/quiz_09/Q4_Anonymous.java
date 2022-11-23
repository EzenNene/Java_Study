package quiz_09;

public class Q4_Anonymous {
	Q4_Vehicle field = new Q4_Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
		
	};
			
	void method1() {
		Q4_Vehicle localVar =  new Q4_Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
			
		};
				
		localVar.run();
	}
	
	void method2(Q4_Vehicle v) {
		v.run();
	}
	
}
