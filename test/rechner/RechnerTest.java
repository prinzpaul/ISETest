package rechner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import rechner.Rechner;

class RechnerTest {

	@Test
	public void testrechnen(){
		Rechner hi = new Rechner();
		assertequals("Test", 4, hi.addiere(1,3));
	}
	@Test
	public void testrechnerr(){
		Rechner hi = new Rechner();
		assertequals("Test", 120, hi.faku(5));
	}
	@Test
	public void testrechne(){
		Rechner hi = new Rechner();
		assertequals("Test", -2, hi.sub(1,3));
	}

}