package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

public class PlayerCollection implements Iterable<GamePlayer> {

	private final List<GamePlayer> gamePlayers;

	/**
	 * A class that allows an iterable collections of GamePlayer objects.
	 */

	public PlayerCollection() {
		this.gamePlayers = new ArrayList<GamePlayer>();
	}

	/**
	 * Method to iterate over collection of GamePlayer objects.
	 */

	public Iterator<GamePlayer> iterator() {
		return new Iterator<GamePlayer>() {

			private final Iterator<GamePlayer> iter = gamePlayers.iterator();

			@Override
			public boolean hasNext() {

				return iter.hasNext();

			}

			@Override
			public GamePlayer next() {

				return iter.next();

			}

		};
	}

	/**
	 * Method to sort collection of GamePlayers objects.
	 */

	public void sort() {

		Collections.sort(gamePlayers);
	}

	/**
	 * Method to add GamePlayer objects to collection.
	 * 
	 * @param p
	 */

	public void add(GamePlayer p) {

		this.gamePlayers.add(p);

	}

	/**
	 * Method to remove GamePlayer objects from collection.
	 * 
	 * @param p
	 */

	public void remove(GamePlayer p) {

		this.gamePlayers.remove(p);

	}

	/**
	 * Method to retrieve GamePlayer from collection.
	 * 
	 * @param gamePlayerString
	 * @return GamePlayer objects based on given String parameter.
	 */

	public GamePlayer get(String gamePlayerString) {

		if (gamePlayerString.equalsIgnoreCase("STRIKER")) {
			return this.gamePlayers.get(0);
		} else if (gamePlayerString.equalsIgnoreCase("GOALKEEPER")) {
			return this.gamePlayers.get(1);
		}

		return null;
	}

}
