package quiz_06_Class;


	public class Account {
		private int balance; // 잔고
		public static final int MIN_BALANCE = 0;
		public static final int MAX_BALANCE = 1000000;
		// 상수 all대문자 snake 사용
		
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			//1. 0 <= balance <= 1,000,000 범위일때
			if(Account.MIN_BALANCE > balance || Account.MAX_BALANCE < balance) {
				return;
			}
			this.balance = balance;
			
		}
		
	
		
		
	}

