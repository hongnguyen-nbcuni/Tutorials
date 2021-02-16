
public class Main {

	public static void main(String[] args) {

		Level lvl = Level.MEDIUM;
		
		Level[] arr = Level.values();
		
		for (Level e: arr) {
			System.out.println(e);   // HIGH MEDIUM LOW
		}	
		
		if (lvl == Level.LOW) {
			System.out.println(lvl);
		}
		else if (lvl == Level.MEDIUM) {
			System.out.println(lvl);
		}
		else {
			System.out.println(lvl);
		}
		
		System.out.println(lvl.getLvl());
		
		System.out.println(Level.valueOf("LOW"));
		
		lvl.setLvl(5);

		System.out.println(lvl.getLvl());
	}


}
