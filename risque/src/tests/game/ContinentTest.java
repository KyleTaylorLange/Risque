package tests.game;

import static org.junit.Assert.*;

import org.junit.Test;

import main.game.Continent;

/**
 * Tests the {@link main.game.Continent} class.
 */
public class ContinentTest {

	/**
	 * Tests functions related to the continent's name.
	 */
	@Test
	public void nameTest() {
		String l_testName = "Ontario";
		Continent l_continent = new Continent(l_testName);
		assertEquals(l_continent.getName(), l_continent);
		String l_newName = "California";
		l_continent.setName(l_newName);
		assertEquals(l_continent.getName(), l_newName);
	}
	
	@Test
	public void bonusArmyTest() {
		int l_numBonusArmies = 5;
		Continent l_continent = new Continent("Testlandia", l_numBonusArmies);
		assertEquals(l_continent.getBonusArmies(), l_numBonusArmies);
		int l_newNumBonusArmies = 9;
		l_continent.setBonusArmies(l_newNumBonusArmies);
		assertEquals(l_continent.getBonusArmies(), l_newNumBonusArmies);
	}
}
