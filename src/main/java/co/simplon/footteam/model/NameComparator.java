package co.simplon.footteam.model;

import java.util.Comparator;

public class NameComparator implements Comparator<Player> {

	public int compare(Player o1, Player o2) {
		String fullname1 = o1.getLastName() + o1.getFirstName();
		String fullname2 = o2.getLastName() + o2.getFirstName();

		return fullname1.compareTo(fullname2);
	}
	
}
