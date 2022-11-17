package quiz_06_Class.last;

public class Account { // 설계도

	// 필드 (속성)
	
	private String ano; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고
	
	// 생성자 : 객체가 생성이 될 때 필드에 초기값 할당
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 메소드
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
