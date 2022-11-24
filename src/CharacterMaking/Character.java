package CharacterMaking;

import java.util.Random;

abstract class Character {
	
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
		if(hp < 0) {
			System.err.println(chaName + " 이(가) 사망했습니다");
		}
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
	
}
