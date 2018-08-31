package co.simplon.footteam.model;

import java.util.Comparator;

public class NoteComparator implements Comparator<Player> {

	public int compare(Player o1, Player o2) {
		int note1 = o1.getAvgNote();
		int note2 = o2.getAvgNote();
		return note1 < note2 ? -1 : (note1 == note2 ? 0 : 1);
	}

}
