package CharacterMaking;

import java.util.Random;

public class Monster {

	private int hp;
	private int ad = 40;
	
	public Monster() {
		Random rand = new Random();
		hp = rand.nextInt(1000) + 3000;
		}
	
	public void recieveDamage(Character character) {
		int damage = character.totalDamage();
		System.out.println( character.chaName + "님이 " + damage + "데미지를 넣었습니다." );
		hp = hp - damage;
		System.out.println("몬스터의 남은 체력: " + (hp >= 0 ? hp : 0));
	}
	
	public void attack(Character character) {
		if (isAlive()) {
			Random rand = new Random();
			int damage = (ad+rand.nextInt(10));
			character.takeDamage(damage);
//			System.out.println(character.chaName + "님이 " + 
//					damage + " 데미지를 입었습니다.");
//			System.out.println(character.chaName + " 남은체력 : " + (character.hp > 0 ? character.hp : 0 ));
		} 
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
	
}
