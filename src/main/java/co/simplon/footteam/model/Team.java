package co.simplon.footteam.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

	/*
	 * Code attributes here
	 * - Name
	 * - Team type (see TeamType enum)
	 * - Players list
	 */
	
	private String name;
	private TeamType type;
	private List<Player> players = new ArrayList<Player>();

	/*
	 * Code constructors here
	 * - One empty constructor
	 * - One constructor with all attributes
	 */
	
	public Team() {
		super();
	}

	public Team(String name, TeamType type, List<Player> players) {
		super();
		this.name = name;
		this.type = type;
		this.players = players;
	}
	
	/*
	 * Code here a function that sort players by their notes
	 */
	
	public void sortPlayersByAvgNote() {
		Collections.sort(players, new NameComparator());
	}
	
	/*
	 * Code here a function that sort players by their position
	 */
	
	public List<Player> sortPlayersByPosition() {
		List<Player> res =  new ArrayList<Player>();
		return res;
	}
	
	/*
	 * Code here a function that sort players by their name
	 */
	
	public List<Player> sortPlayersByName() {
		List<Player> res =  new ArrayList<Player>();
		return res;
	}
	
	/**
	 * Add a player to the team
	 * @param player: player to add
	 * @return true if player was not already part of the team, false otherwise
	 */
	public boolean addPlayer(Player player) {
		return this.players.add(player);
	}
		
	@Override
	public String toString() {
		return "Team [name=" + name + ", type=" + type + ", nb players=" + players.size() + "]";
	}
	
	
	
}
