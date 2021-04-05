package tests.game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.game.GameEngine;

/**
 * Tests the {@link main.game.GameEngine} class.
 */
public class GameEngineTest {
	
	/**
	 * Reference to the game engine we're testing.
	 */
	GameEngine d_engine;
	
	/**
	 * Sets up the GameEngine before executing a test.
	 */
	@Before
	public void before() {
		d_engine = new GameEngine();
	}

	/**
	 * Ensures that we always have a default blank map at start.
	 */
	@Test
	public void getDefaultMap() {
		assertNotNull(d_engine);
		assertNotNull(d_engine.getMap());
	}

}
