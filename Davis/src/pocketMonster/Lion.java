package pocketMonster;

	public class Lion {
		
		public static void main(String[] args) {
			int numberoflions = 101;
			if(willEat(numberoflions)) {
				System.out.println("Eat the sheep");
			}else {
				System.out.println("No eat sheep");
		}
	}

		private static boolean willEat(int numberoflions) {
			if(numberoflions == 1) {
			return true;
			}
			return !willEat(numberoflions-1);
		}

}
