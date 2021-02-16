
public class Main03_08 {
	public static void main(String[] args) {
		Dice dice = new Dice();
		System.out.println("Previous: " + dice.previousRoll);
		System.out.println(dice.roll());
		System.out.println("Previous: " + dice.previousRoll);
		System.out.println(dice.roll());
		System.out.println("Previous: " + dice.previousRoll);
	}
	
}