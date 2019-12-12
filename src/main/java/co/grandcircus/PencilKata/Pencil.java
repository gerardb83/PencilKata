package co.grandcircus.PencilKata;

public class Pencil {

	private int point;
	private int originalPoint;
	private String letters = "";
	private String spaces = "";


	public Pencil() {
	}

	public Pencil(int point) {
		this.point = point;
		this.originalPoint = point;
	}

	public void write(String string, Paper paper) {
		degrade(string);		
		paper.addString(letters + spaces);
	}

	

	public void degrade(String string) {
		String tempLetters = "";
		String tempSpaces = "";
		for (int i = 0; i < string.length(); i++) {
			if (isSharp()) {
				tempLetters += string.substring(i, i + 1);
				point--;
			} else {
				tempSpaces += " ";
			}
			letters = tempLetters;
			spaces = tempSpaces;
		}
	}

	public int getPoint() {
		return point;
	}

	public boolean isSharp() {
		return point > 0;
	}

	public void sharpen() {
		point = originalPoint;
	}

}
