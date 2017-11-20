
public class Wilderness extends Habitat {

	private String description;
	public Wilderness(int livingCapacity, String description) {
		super(livingCapacity);
		this.description = description;
	}

	public static void main(String[] args) {
		Wilderness w =new Wilderness(10,"an empty dessert");
		w.simulate(3);

	}

	public void simulate(int rounds) {
		for(int i =0;i<rounds;i++) {
			for(Animal a: getAnimals()) {
				if(a instanceof ReproductionAnimal)((ReproductionAnimal)a).reset();
			}
			int predatorCount = 0;
			int preyCount = 0;
			for(Animal a:getAnimals()) {
				if(a instanceof Predator) {
					predatorCount++;
				}
				if(a instanceof Prey) {
					preyCount++;
				}
			}
			String s = "\nROUND "+(i+1)+"\nPREDATORS: "+predatorCount+", PREY: "+preyCount+"\n"+animalReport();
			System.out.println(s);
			for(Animal a: getAnimals()) {
				if(a != null)a.act();
			}
			growPlants();
		}
		
	}

}
