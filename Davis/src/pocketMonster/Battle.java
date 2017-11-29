package pocketMonster;

public class Battle {
	 public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle is preparing to attack with water blast");
		 squirtle.attack(bulbasaur, new Attack() {
		 
		 public void attack(Pokemon target) {
		 int hp = target.getHP();
		 target.setHP(hp/2);
		 }
		 });
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 bulbasaur.attack(squirtle, new Attack() {
		 
		 public void attack(Pokemon target) {
		 target.setPoisoned(true);
		 }
		 });
		 squirtle.lapse();
		 bulbasaur.lapse();
		 squirtle.attack(bulbasaur,new Attack() {
			
			@Override
			public void attack(Pokemon target) {
				int hp = target.getHP();
				target.setHP(hp-100);
				
			}
		});
		 squirtle.levelUp(new Effect() {
			
			@Override
			public void happen() {
				int hp = squirtle.getHP();
				hp += 100;
				squirtle.setHP(hp*2);
				
				
			}
		});		 }


}
