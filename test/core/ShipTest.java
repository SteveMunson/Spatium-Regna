package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShipTest {
	Planet p;
	String planetName = "Earth";
	Location loc;
	int x = 5;
	int y = 3;
	Location loc2;
	Ship ship;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		loc = new Location(x, y);
		p = new BasicPlanet(planetName, loc);
		ship = new BasicShip();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertNotNull(ship);
		assertEquals(null, ship.getLocation());
		ship.setLocation(loc2);
		assertFalse(ship.setOrbit(p));
		ship.setLocation(loc);
		assertTrue(ship.setOrbit(p));
		assertTrue(p.isOrbiting(ship));
		System.out.println(p);
	}
}
