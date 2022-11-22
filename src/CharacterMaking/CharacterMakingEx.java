package CharacterMaking;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterMakingEx {

//	private static ArrayList<Character> characterList = new ArrayList<Character>();

	public static void main(String[] args) {

		// 캐릭터 생성

		Scanner scanner = new Scanner(System.in);

//		String chaName = "엘리시아";
//		String chaClass = "Warrior";

		Character character = null;
		while (character == null) {
			System.out.println("캐릭터 이름 입력");
			String chaName = scanner.nextLine();
			System.out.println("캐릭터 직업 입력");
			String chaClass = scanner.nextLine();
			
			character = makeCharacter(chaName, chaClass);
		}
		// 플레이할 캐릭터 찾기

//		Character character = findPlayer(chaName);

//		if (character == null) {
//			System.out.println("존재하지 않는 직업입니다.");
//			return;
//		}

		// 찾은 캐릭터로 몬스터 공격

		int turn = 1;

		Monster monster = new Monster();
		while (monster.isAlive()) {
			System.out.println(turn++ + "번째 턴: " + "\n");
			monster.recieveDamage(character);
			monster.attack(character);
			System.out.println("===========================");
		}

	}

	private static Character makeCharacter(String chaName, String chaClass) {
		if (chaClass.equals("Warrior")) {
			return new Cha_Warrior(chaName, chaClass);
		} else if (chaClass.equals("Wizard")) {
			return new Cha_Wizard(chaName, chaClass);
		} else {
			System.out.println("입력하신 직업을 다시 확인해 주세요");
			return null;
		}
	}

}
