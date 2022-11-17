package quiz_06_Class;

import java.util.Scanner;

public class Quiz_23_BankApplication {

	private static Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
	private static Quiz_23_Account accountArray[] = new Quiz_23_Account[100]; // 길이 100 Account 배열 생성

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>");

			int selectNo = scanner.nextInt(); // 숫자형(int) 값을 받는다

			if (selectNo == 1)
				createAccount();
			else if (selectNo == 2)
				accountList();
			else if (selectNo == 3)
				deposit();
			else if (selectNo == 4)
				withdraw();
			else if (selectNo == 5)
				run = false; // 프로그램 끝내기

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

		Quiz_23_Account newAccount = new Quiz_23_Account(ano, owner, balance);
		// 계좌만듬

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	// 2. 계좌목록
	public static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");

		for (int i = 0; i < accountArray.length; i++) {
			Quiz_23_Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	// 3. 예금
	public static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = scanner.nextInt();

		int index = -1;

		for (int i = 0; i < accountArray.length; ++i) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("계좌를 찾을 수 없습니다");
		} else {
			accountArray[index].setBalance(accountArray[index].getBalance() + money);
			System.out.println(money + "원을 예금하였습니다");
		}
	}

	// 4. 출금
	public static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();

		int index = -1;

		for (int i = 0; i < accountArray.length; ++i) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("계좌를 찾을 수 없습니다");
		} else {

			if (accountArray[index].getBalance() - money < 0) {
				System.out.println("잔액부족");
			} else {

				accountArray[index].setBalance(accountArray[index].getBalance() - money);
				System.out.println(money + "원을 출금하였습니다");

			}
		}
	}

	// 5. AccountArray 배열에서 ano와 동일한 Account객체 찾는 역할을 한다

}
