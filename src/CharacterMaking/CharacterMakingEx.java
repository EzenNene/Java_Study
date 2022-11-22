package CharacterMaking;

import java.util.ArrayList;
import java.util.Scanner;


public class CharacterMakingEx {

	private static ArrayList<Character> characterList = new ArrayList<Character>();
	
	public static void main(String[] args) {
		
		// 캐릭터 생성
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("캐릭터 이름 입력");
		String chaName = scanner.nextLine();
		System.out.println("캐릭터 직업 입력");
		String chaClass = scanner.nextLine();
		
		if(chaClass == "Warrior") {
			Character character1 = new Cha_Warrior(chaName, chaClass);
			characterList.add(character1);			
		} else if (chaClass == "Wizard") {			
			Character character2 = new Cha_Wizard(chaName, chaClass);
			characterList.add(character2);
		} else {
			System.out.println("입력하신 직업을 다시 확인해 주세요");
		}
		
		// 캐릭터 찾기
		
		Character character = findPlayer(chaName);
		
		// id로 찾은 고객의 실제 지불금액, 보너스 포인트 출력
		if (character == null) {
			System.out.println("존재하지 않는 캐릭터입니다.");
		} else {
			System.out.println();
		}
		
		// 찾은 캐릭터로 몬스터 공격
		
		attackMonster();
		
	}

	
	
	
	
	
	public static Character findPlayer(String chaName) {
		
		Character resultCharacter = null;
		
		for(Character character : characterList) {
			// 해당 객체의 id와 매개변수로 받아온 id가 같은지 비교한다
			if(Character.getId() == id) {
				resultCharacter = customer;
				break;
			}
		}
		
		return resultCustomer;
		
	}

	private static void attackMonster() {
		System.out.println("\n" + "=== 공격실행 ===" + "\n");
		for(Character character : characterList) {
			System.out.println(character[] + );
		}
	}

}
