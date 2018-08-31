package co.simplon.footteam.model;

public enum TeamType {
//	COUNTRY, CLUB
	COUNTRY("Country"),
	CLUB("Club");
	
	private String label;
	
	private TeamType(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
}
