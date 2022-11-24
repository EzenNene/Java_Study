package CharacterMaking;

import java.util.Scanner;

public class CharacterMakingEx {

//	private static ArrayList<Character> characterList = new ArrayList<Character>();

	// 캐릭터 생성해서 넣어놓을 배열 선언
	public static Character characterList[] = new Character[5];
	
	public static void main(String[] args) {

		// 캐릭터 생성

		Character character = null;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("====== 캐릭터 이름을 정하세요 ======" + "\n");
		String chaName = scanner.nextLine();
		System.out.println("====== 캐릭터 직업 선택 ======");
		System.out.println("1: 전사 2: 마법사 3: 도적");
		System.out.println("==========================" + "\n");
		int chaClass = scanner.nextInt();

		makeCharacter(chaName, chaClass);

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

		System.out.println("===========================");

		int turn = 1;

		Monster monster = new Monster();
		while (monster.isAlive()) {
			boolean noCharactersAlive = true;
			for (Character characterList : characterList) {
				if (characterList.isAlive()) {
					noCharactersAlive = false;
				}
			}
			if (noCharactersAlive) {
				break;
			}

			System.out.println(turn++ + "번째 턴: " + "\n");
			for (Character characterList : characterList) {
				if (monster.isAlive() && characterList.isAlive()) {
					monster.recieveDamage(character);
				}
			}
			if (monster.isAlive()) {
				System.out.println("===========================");
			}
			for (Character characterList : characterList) {
				if (monster.isAlive() && characterList.isAlive()) {
					monster.attack(character);
				}
			}
			System.out.println("===========================");
		}
		if (monster.isAlive()) {
			System.out.println("게임오버");
		} else {
			System.err.println("몬스터가 사망했습니다.");
		}

	} // 메인함수 끝
		// =============================================================================


	private static Character makeCharacter(String chaName, int chaClass) {

		
		
		int i = 0;

		for (i = 0; i < characterList.length; i++) {

			if (chaClass == 1) {
				Character character = new Cha_Warrior(chaName, chaClass);
				character.setWeapon(new WeaponSword());
				characterList[i] = character;
			} else if (chaClass == 2) {
				Character character = new Cha_Wizard(chaName, chaClass);
				character.setWeapon(new WeaponStaff());
				characterList[i] = character;
			} else if (chaClass == 3) {
				Character character = new Cha_Thief(chaName, chaClass);
				character.setWeapon(new WeaponKnife());
				characterList[i] = character;
			} else {
				System.out.println("입력하신 직업을 다시 확인해 주세요");
				return null;
			}
		}
		return null;
	}
}
