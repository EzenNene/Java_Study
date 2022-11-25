package CharacterMaking;

import java.util.Random;

abstract class Character {
	
	public static final String RESET = "\u001B[0m";    
	public static final String FONT_RED = "\u001B[31m";     
	
	
	//필드
	int level = 1;
	public int hp;
	public String chaName;
	public int chaClass;	
	int classConstant;			// 직업상수
	Weapon weapon;


	
	//생성자
	Character (String chaName, int chaClass) {
		this.chaName = chaName;
		this.chaClass = chaClass;
	}
	
	
	
	//메소드
	
	abstract public int classDamage();
	public int totalDamage() {
		 return (classDamage() + weapon.weaponDamage());
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void takeDamage(int damage) {
		hp -= damage;
		System.out.println(FONT_RED + chaName + "님이 " + damage + " 데미지를 입었습니다." + RESET);
		System.out.println(chaName + " 남은체력 : " + (hp > 0 ? hp : 0 ));
		if(hp < 0) {
			System.err.println(chaName + " 님이 사망했습니다");
		}
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
	
}
