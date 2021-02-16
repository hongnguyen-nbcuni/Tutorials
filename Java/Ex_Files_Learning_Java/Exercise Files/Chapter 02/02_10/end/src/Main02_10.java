public class Main02_10 {

	public static void main(String[] args) {
		Dog d = new Dog("Doug", 3);

		d.bark();

		int dogYears = d.getDogYears();
		System.out.println(dogYears + " dog years.");

		d.fetch();
		d.fetch();
		d.fetch();
		d.fetch();

	}

}


