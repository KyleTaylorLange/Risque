package main.strategy;

import java.util.LinkedList;

import main.game.Map;
import main.game.Territory;
import main.game.Continent;
import main.game.Player;

/**
* This interface is used to implement PlayerStrategy
*
*/

public interface PlayerStrategy {
	
	/**
	 * This method is for deploy on player's Territory
	 * 
	 * @param p_map Map Object
	 * @param p_listPlayer List of Players
	 * @param p_player Current Player
	 */
	void deploy(Map p_map, LinkedList<Player> p_listPlayer, Player p_player);
	
	/**
	 * This method is for attack
	 * 
	 * @param p_map Map Object
	 * @param p_listPlayer List of Players
	 * @param p_player Current Player
	 * 
	 */
	int attack(Map p_map, LinkedList<Player> p_listPlayer, Player p_player);
	
	/**
	 * This method is for reinforcement
	 * 
	 * @param p_map
	 * @param p_listPlayer List of Players
	 * @param p_player
	 */
	void reinforcement(Map p_map, LinkedList<Player> p_listPlayer, Player p_player);
	
	
	/**
	 * The number of deployed armies would be calculated in this method
	 * 
	 * @param p_map Map object
	 * @param p_player Player object
	 * @return Number of deployed armies
	 */
	int calculateDeployedArmies(Map p_map, Player p_player);
}