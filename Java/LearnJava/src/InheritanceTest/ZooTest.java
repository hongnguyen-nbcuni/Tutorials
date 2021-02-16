package InheritanceTest;

import org.testng.annotations.Test;

public class ZooTest {

	@Test
	public void shouldFeedAllAnimals() {
		Zoo zoo = new Zoo();
		Animal[] animals = {new Dog(), new Gorilla(), new Lion(), new Tiger(),};
		
		zoo.feedAnimals(animals);
	}
}
