package co.grandcircus.PencilKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
   
	
	

	@Test
	public void whenPencilWritesOnPaperItStoresTheText() {
		Pencil pencil = new Pencil(14);
		Paper paper = new Paper();
		pencil.write("Test sentence", paper);
		String actual = paper.getText();
		String expected = "Test sentence";
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPencilWritesMoreItAddsToExistingSentence() {
		Pencil pencil = new Pencil(35);
		Paper paper = new Paper();
		pencil.write("Test sentence", paper);
		pencil.write(". Next test sentence.", paper);
		String actual = paper.getText();
		String expected = "Test sentence. Next test sentence.";
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPencilWritesALowercaseLetterItsPointDegradesByOne() {
		Pencil pencil = new Pencil(5);
		Paper paper = new Paper();
		pencil.write("ee", paper);
		int actual = pencil.getPoint();
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPencilWritesWithNoPointItWritesSpaces() {
		Pencil pencil = new Pencil(3);
		Paper paper = new Paper();
		pencil.write("text", paper);
		String actual = paper.getText();
		String expected = "tex ";
		assertEquals(expected, actual);
	}
}
