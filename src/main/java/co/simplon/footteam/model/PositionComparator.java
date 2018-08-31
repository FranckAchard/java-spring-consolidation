package co.simplon.footteam.model;

import java.util.Comparator;

public class PositionComparator implements Comparator<Player> {

	public int compare(Player o1, Player o2) {
		int pos1 = o1.getPosition();
		int pos2 = o2.getPosition();
		return pos1 < pos2 ? -1 : (pos1 == pos2 ? 0 : 1);
	}

}
