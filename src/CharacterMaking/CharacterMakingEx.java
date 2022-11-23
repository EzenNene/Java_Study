package CharacterMaking;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterMakingEx {

//	private static ArrayList<Character> characterList = new ArrayList<Character>();

	public static void main(String[] args) {

		// 캐릭터 생성

//		Scanner scanner = new Scanner(System.in);
//		
//		Character character = null;
//	
//		while (character == null) {
//			System.out.println("====== 캐릭터 이름을 정하세요 ======" + "\n");
//			String chaName = scanner.nextLine();
//			System.out.println("====== 캐릭터 직업 선택 ======");
//			System.out.println("1: 전사 2: 마법사 3: 도적");
//			System.out.println("==========================" + "\n");
//			int chaClass = scanner.nextInt();
//			
//			character = makeCharacter(chaName, chaClass);
//		}

		Character character1 = makeCharacter("엘리시아", 2);
		Character character2 = makeCharacter("라이언", 2);
		Character character3 = makeCharacter("칼헤론", 3);
		Character character4 = makeCharacter("루디", 1);
		Character character5 = makeCharacter("델론즈", 3);

		ArrayList<Character> characterList = new ArrayList<>();
		characterList.add(character1);
		characterList.add(character2);
		characterList.add(character3);
		characterList.add(character4);
		characterList.add(character5);

		// 찾은 캐릭터로 몬스터 공격

		System.out.println("===========================");

		int turn = 1;

		Monster monster = new Monster();
		while (monster.isAlive()) {
			boolean noCharactersAlive = true;
			for (Character character : characterList) {
				if (character.isAlive()) {
					noCharactersAlive = false;
				}
			}
			if (noCharactersAlive) {
				break;
			}

			System.out.println(turn++ + "번째 턴: " + "\n");
			for (Character character : characterList) {
				if (monster.isAlive() && character.isAlive()) {
					monster.recieveDamage(character);
				}
			}
			if (monster.isAlive()) {
				System.out.println("===========================");
			}
			for (Character character : characterList) {
				if (monster.isAlive() && character.isAlive()) {
					monster.attack(character);
				}
			}
			System.out.println("===========================");
		}
		if (monster.isAlive()) {
			System.out.println("게임오버");
		} else {
			System.out.println("몬스터가 사망했습니다.");
		}

	} // 메인함수 끝

	private static Character makeCharacter(String chaName, int chaClass) {
		if (chaClass == 1) {
			Character character = new Cha_Warrior(chaName, chaClass);
			character.setWeapon(new WeaponSword());
			return character;
		} else if (chaClass == 2) {
			Character character = new Cha_Wizard(chaName, chaClass);
			character.setWeapon(new WeaponStaff());
			return character;
		} else if (chaClass == 3) {
			Character character = new Cha_Thief(chaName, chaClass);
			character.setWeapon(new WeaponKnife());
			return character;
		} else {
			System.out.println("입력하신 직업을 다시 확인해 주세요");
			return null;
		}

	}

}
