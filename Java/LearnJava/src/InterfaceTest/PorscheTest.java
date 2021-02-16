package InterfaceTest;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class PorscheTest {

	@Test
	public void shouldCloneStringArray() {
		String[] array = {"one", "two", "three"};
		String[] copiedArray = array.clone();        // this is not the same object as array

		assertSame(array, array);
		assertNotSame(array, copiedArray);

	}

	@Test
	public void shouldClonePorsche() {
		Porsche porsche = new Porsche("Marcus");
		Porsche petersPorsche = porsche.clone();

		assertNotSame(porsche, petersPorsche);

		petersPorsche.sellTo("Peter");
		assertEquals("Porsche of Peter", petersPorsche.asString());
		assertEquals("Porsche of Marcus", porsche.asString());
		

	}
}
