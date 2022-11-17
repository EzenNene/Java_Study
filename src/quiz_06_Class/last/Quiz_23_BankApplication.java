package quiz_06_Class.last;

import java.util.Scanner;

public class Quiz_23_BankApplication {
	
	private static Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
	
	//Account 객체를 담는 배열
	private static Account[] accountArray = new Account[100];

	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
		System.out.println("------------------------------------------");
		System.out.println("선택>");
		
		int selectNo = scanner.nextInt(); // 숫자형(int) 값을 받는다
	
		if(selectNo == 1) createAccount();
		else if (selectNo ==2) accountList();
		else if (selectNo ==3) deposit();
		else if (selectNo ==4) withdraw();
		else if (selectNo ==5) run = false; // 프로그램 끝내기
		
//		String inputNumber = scanner.nextLine();
//		
//		if(inputNumber.equals("1")) {
//			System.out.println("---------");
//			System.out.println("계좌생성");
//			System.out.println("---------");
//			System.out.print("계좌번호: ");
//			Scanner scanner1 = new Scanner(System.in);
//			String accountNumber = scanner1.nextLine();
//		} else if(accountNumber.equals("111-111")) {
//			System.out.print("계좌주: ");
//			Scanner scanner2 = new Scanner(System.in);
//			System.out.println("초기입금액: ");
//			Scanner scanner3 = new Scanner(System.in);
//			System.out.print("결과: 계좌가 생성되었습니다.");
//		}		
//		scanner.close();
		
		}
		
		System.out.println("프로그램 종료.");
		
	}
	
	// static 있어야 main 메소드에서 바로 호출 가능
	// 리턴값 몰라서 void설정
	
	// 1. 계좌생성
	public static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		
		System.out.println("계좌주: ");
		String owner = scanner.next();
		
		System.out.println("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance); 
		// 계좌만듬
		
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}	
	// 2. 계좌목록
	public static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			System.out.println();
		}
	}
	// 3. 예금
	public static void deposit() {}
	// 4. 출금
	public static void withdraw() {}
	// 5. AccountArray 배열에서 ano와 동일한 Account객체 찾는 역할을 한다
	private static Account findAccount(String)
	
	
	
	
	

}
