package pocketMonster;

public class Pokemon {
	private int level;
	private int hp;
	String name;
	boolean poisoned;
	 
	public Pokemon(String name, int level) {
		this.level = level;
		this.name = name;
		this.poisoned = false;
		this.hp = 100;
	}
	public void iChooseYou() {
		System.out.println(name+" "+name);
	}
	public int getHP() {
		return this.hp;
	}
	public void setHP(int hp) {
		this.hp = hp;
	}
	public void setPoisoned(boolean b) {
		this.poisoned = b;
	}
	public String getName() {
		return this.name;
	}
	public void lapse() {
		if(poisoned) {
			this.hp-=15;
		}
	}
	public void levelUp(Effect e) {
		level++;
		e.happen();
	}
	 public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
			 attack.attack(target);
			 System.out.println("The attack hit");
		 }else{
			 System.out.println("The attack missed");
		 }
	}
}

