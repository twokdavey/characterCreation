package characterCreation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Character {
	private String name;
	private int health;
	private int magic;
	private int tactical;
	private int crafting;
	private int gathering;
	List<Weapon> weapons= new ArrayList<Weapon>();
	
	
	public Character(String name){
		this.name=name;
		this.health =ThreadLocalRandom.current().nextInt(1, 5 + 1);
		this.magic =ThreadLocalRandom.current().nextInt(1, 3 + 1);
		this.tactical =ThreadLocalRandom.current().nextInt(1, 3 + 1);
		this.crafting =ThreadLocalRandom.current().nextInt(1, 3 + 1);
		this.gathering =ThreadLocalRandom.current().nextInt(1, 3 + 1);
		
	}
	public Character(int enemyLevel,String creatureType, String location){
		this.health = enemyLevel*2;
		
	}
	public String getName(){
		return name;
	}
	public int getHealth(){
		return health;
	}
	public int getMagic(){
		return magic;
	}
	public int getTactical(){
		return tactical;
	}
	public int getCrafting(){
		return crafting;
	}
	public int getGathering(){
		return gathering;
	}
	public void takeDamage(int damage){
		this.health-=damage;
	}
	public void heal(int potion){
		this.health+=potion;
	}
	public void weaponTest(int number){
		weapons.add(new Weapon(number));
		
	}
	public void equipWeapon(String charWeapon){
		if(weapons.contains(charWeapon)){

		}
	}

}
