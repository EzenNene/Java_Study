package CharacterMaking;

import java.util.Scanner;

public class CharacterMakingEx {

	public static final String RESET = "\u001B[0m";
	public static final String FONT_BLACK = "\u001B[30m";
	public static final String FONT_RED = "\u001B[31m";
	public static final String FONT_GREEN = "\u001B[32m";
	public static final String FONT_YELLOW = "\u001B[33m";
	public static final String FONT_BLUE = "\u001B[34m";
	public static final String FONT_PURPLE = "\u001B[35m";
	public static final String FONT_CYAN = "\u001B[36m";
	public static final String FONT_WHITE = "\u001B[37m";
	public static final String BACKGROUND_BLACK = "\u001B[40m";
	public static final String BACKGROUND_RED = "\u001B[41m";
	public static final String BACKGROUND_GREEN = "\u001B[42m";
	public static final String BACKGROUND_YELLOW = "\u001B[43m";
	public static final String BACKGROUND_BLUE = "\u001B[44m";
	public static final String BACKGROUND_PURPLE = "\u001B[45m";
	public static final String BACKGROUND_CYAN = "\u001B[46m";
	public static final String BACKGROUND_WHITE = "\u001B[47m";

//	private static ArrayList<Character> characterList = new ArrayList<Character>();

	// 캐릭터 생성해서 넣어놓을 배열 선언
	public static Character characterList[] = new Character[3];

	public static void main(String[] args) {

		// 캐릭터 생성

		makeCharacter();

//		Character character1 = makeCharacter("엘리시아", 2);
//		Character character2 = makeCharacter("라이언", 2);
//		Character character3 = makeCharacter("칼헤론", 3);
//		Character character4 = makeCharacter("루디", 1);
//		Character character5 = makeCharacter("델론즈", 3);

//		characterList.add(character1);
//		characterList.add(character2);
//		characterList.add(character3);
//		characterList.add(character4);
//		characterList.add(character5);

		// 찾은 캐릭터로 몬스터 공격

		System.out.println("===========게임시작===========");

		int turn = 1;

		Monster monster = new Monster();

		/*
		 * 몬스터가 살아있는 동안 [살아있는 캐릭터는 없다] = true 그러나, 만약 캐릭터가 살아있으면 [살아있는 캐릭터는 없다] = false
		 * 재정의 몬스터가 살아있는 동안 while문 계속 돌리기 {턴 지나가기, 몬스터 공격하기, 공격받기}
		 */

		while (monster.isAlive()) {

			boolean noCharactersAlive = true;

			for (Character characterList : characterList) {
				if (characterList.isAlive()) {
					// 캐릭터 배열을 돌리면서 한명이라도 살아있으면 [살아있는 캐릭터는 없다] 변수에 false 대입
					noCharactersAlive = false;
				}
			}

			if (noCharactersAlive) {
				// 만약 모든 반복에서 하나라도 위의 if문 조건을 충족하지 못하면
				// (살아있는 캐릭터가 없다가 true 이면) 그대로 while문 종료
				break;
			}

			System.out.println("<" + turn++ + "번째 턴>" + "\n");
			// 모든 캐릭터로부터 한번씩 공격받기 (characterList 사용)
			for (Character character : characterList) {
				if (monster.isAlive() && character.isAlive()) {
					monster.recieveDamage(character);
				}
			}
			// 공격받았는데 몬스터가 살아있으면 (몬스터의 hp > 0 이면)
			if (monster.isAlive()) {
				System.out.println("===========================");

				for (Character character : characterList) {
					if (monster.isAlive() && character.isAlive()) {
						monster.attack(character);
					}
				}

				System.out.println("===========================");

			}
		} // while 문 끝===========================

		// while 반복문이 끝났는데 몬스터가 살아있으면 게임오버 출력
		// while 반복문이 끝났는데 몬스터가 살아있지않으면 몬스터 사망 출력
		if (monster.isAlive()) {
			System.out.println("게임오버");
		} else {
			System.out.println("============================");
			System.err.println("몬스터가 사망했습니다.");
		}

	} // 메인함수 끝 ==============================================================

	private static void makeCharacter() {

		int characterCount = 0;

		// 캐릭터가 3 미만일 때 while문 (캐릭터 만드는 것) 반복
		while (characterCount < 3) {

			Scanner scanner = new Scanner(System.in);

			System.out.println(
					BACKGROUND_GREEN + "====== " + (characterCount + 1) + " 번째 캐릭터 이름을 정하세요 ======" + "\n" + RESET);
			String chaName = scanner.nextLine();
			System.out.println("====== 캐릭터 직업 선택 ======");
			System.out.println(FONT_YELLOW + "1: 전사 2: 마법사 3: 도적" + RESET);
			System.out.println("==========================" + "\n");

			int chaClass;

			try {
				chaClass = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("숫자를 입력해 주세요");
				continue;
			}

			if (chaClass == 1) {
				Character character = new Cha_Warrior(chaName, chaClass);
				character.setWeapon(new WeaponSword());
				characterList[characterCount] = character;
			} else if (chaClass == 2) {
				Character character = new Cha_Wizard(chaName, chaClass);
				character.setWeapon(new WeaponStaff());
				characterList[characterCount] = character;
			} else if (chaClass == 3) {
				Character character = new Cha_Thief(chaName, chaClass);
				character.setWeapon(new WeaponKnife());
				characterList[characterCount] = character;
			} else {
				System.out.println("입력하신 직업을 다시 확인해 주세요");
				continue;
			}

			characterCount++;

		} // while 문 끝 ============================================================

	}
}
