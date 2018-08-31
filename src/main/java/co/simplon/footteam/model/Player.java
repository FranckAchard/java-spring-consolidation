package co.simplon.footteam.model;

public class Player {

	/*
	 * Code attributes here
	 * - First name of the player
	 * - Last name of the player
	 * - Position on the field (number)
	 * - Average note (0 to 100)
	 */
	
	private String firstName;
	private String lastName;
	private int position;
	private int avgNote;

	
	/*
	 * Code constructors here
	 * - One empty constructor
	 * - One constructor with all attributes
	 */
	public Player() {
		super();
	}
	
	public Player(String firstName, String lastName, int position, int avgNote) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.avgNote = avgNote;
	}

	/* 
	 * Getters and setters
	 */
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getAvgNote() {
		return avgNote;
	}

	public void setAvgNote(int avgNote) {
		this.avgNote = avgNote;
	}


	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + ", position=" + position + ", avgNote="
				+ avgNote + "]";
	}
	
	
}

