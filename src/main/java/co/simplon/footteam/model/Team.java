package co.simplon.footteam.model;

import java.util.HashSet;
import java.util.Set;

public class Team {

	/*
	 * Code attributes here
	 * - Name
	 * - Team type (see TeamType enum)
	 * - Players list
	 */
	
	private String name;
	private TeamType type;
	private Set<Player> players = new HashSet<Player>();

	/*
	 * Code constructors here
	 * - One empty constructor
	 * - One constructor with all attributes
	 */
	
	public Team() {
		super();
	}

	public Team(String name, TeamType type, Set<Player> players) {
		super();
		this.name = name;
		this.type = type;
		this.players = players;
	}
	
	/*
	 * Code here a function that sort players by their notes
	 */
	
	public Set<Player> sortPlayersByAvgNote() {
		Set<Player> res =  new HashSet<Player>();
		return res;
	}
	
	/*
	 * Code here a function that sort players by their position
	 */
	
	public Set<Player> sortPlayersByPosition() {
		Set<Player> res =  new HashSet<Player>();
		return res;
	}
	
	/*
	 * Code here a function that sort players by their name
	 */
	
	public Set<Player> sortPlayersByName() {
		Set<Player> res =  new HashSet<Player>();
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
