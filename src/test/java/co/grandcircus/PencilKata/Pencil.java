package co.grandcircus.PencilKata;

public class Pencil {

	private int point;

	
	public Pencil() {
	}
	
	public Pencil(int point) {
		this.point = point;
	}

	public void write(String string, Paper paper) {
		degrade(string);
		paper.addString(string);
	}
	
	public void degrade(String string) {
		for (int i = 0; i < string.length(); i++) {
			point--;
		}
	}

	public int getPoint() {
		return point;
	}

}
