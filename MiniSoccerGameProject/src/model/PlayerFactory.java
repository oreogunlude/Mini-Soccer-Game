package model;

import java.util.Random;
import java.awt.*;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

/**
 * Factory class to create GamePlayer objects.
 */

public class PlayerFactory {

	Color randomColor1;
	Color randomColor2;

	/**
	 * Creates factory objects that creates GamePlayer objects and assigns random
	 * colors to them.
	 */

	public PlayerFactory() {
		Random rand = new Random();
		float r1 = rand.nextFloat();
		float g1 = rand.nextFloat();
		float b1 = rand.nextFloat();
		float r2 = rand.nextFloat();
		float g2 = rand.nextFloat();
		float b2 = rand.nextFloat();

		this.randomColor1 = new Color(r1, g1, b1);
		this.randomColor2 = new Color(r2, g2, b2);
	}

	/**
	 * Creates GamePlayer objects based on given parameter.
	 * 
	 * @param gamePlayerString
	 * @return GamePlayer objects based on given String parameter or return null if
	 *         none given.
	 */

	public GamePlayer getPlayer(String gamePlayerString) {
		if (gamePlayerString == null) {
			return null;
		} else if (gamePlayerString.equalsIgnoreCase("STRIKER")) {
			return new Striker("Striker", randomColor1);
		} else if (gamePlayerString.equalsIgnoreCase("GOALKEEPER")) {
			return new Goalkeeper("Goal Keeper", randomColor2);
		}

		return null;
	}
}
