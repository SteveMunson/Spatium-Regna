package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlanetTest {
	Planet p;
	String planetName = "Earth";
	Location loc;
	int x = 5;
	int y = 3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		loc = new Location(x,y);
		p = new BasicPlanet();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(null, p.getName());
		p.setName(planetName);
		assertEquals(planetName, p.getName());

		assertEquals(null, p.getLocation());
		loc.setX(x);
		loc.setY(y);
		p.setLocation(loc);
		assertEquals(x, p.getLocation().getX());
		assertEquals(y, p.getLocation().getY());
		System.out.println(p);
	}

}
