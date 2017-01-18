package characterCreation;

public class Weapon {
	private String weaponName;
	private int damage;
	private int durability;

	public Weapon(int itemNumber) {
		aquireWeapon(itemNumber);
	}

	public String getWeaponName() {
		return weaponName;
	}

	public int getDamage() {
		return damage;
	}

	public int getDurability() {
		return durability;
	}

	public void aquireWeapon(int number) {
		if (number == 0) {

			weaponName = "Rusty Dagger";
			damage = 5;
			durability = 15;
		}
		else if(number == 1){
			weaponName = "Rusty Sword";
			damage = 12;
			durability = 21;	
		}
		else if(number == 2){
			weaponName = "Bronze Dagger";
			damage = 15;
			durability = 30;	
		}
		else if(number == 3){
			weaponName = "Bronze Sword";
			damage = 20;
			durability = 30;	
		}
		else if(number == 4){
			weaponName = "Iron Dagger";
			damage = 25;
			durability = 35;	
		}
		else if(number == 5){
			weaponName = "Iron Sword";
			damage = 32;
			durability = 35;	
		}
		else if(number == 6){
			weaponName = "Steel Dagger";
			damage = 40;
			durability = 50;	
		}
		else if(number == 7){
			weaponName = "Steel Sword";
			damage = 55;
			durability = 50;	
		}
		else if(number == 8){
			weaponName = "Magic Dagger";
			damage = 82;
			durability = -1;	
		}
	}

}
