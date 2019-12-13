package co.grandcircus.PencilKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
   
	Pencil pencil3;
	Pencil pencil5;
	Pencil pencil14;
	Pencil pencil35;
	Paper paper;
	
	@BeforeEach
	public void setup() {
		pencil3 = new Pencil(3);
		pencil5 = new Pencil(5);
		pencil14 = new Pencil(14);
		pencil35 = new Pencil(35);
		paper = new Paper();
	}
	

	@Test
	public void whenPencilWritesOnPaperItStoresTheText() {
		pencil14.write("Test sentence", paper);
		String actual = paper.getText();
		String expected = "Test sentence";
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPencilWritesMoreItAddsToExistingSentence() {
		pencil35.write("Test sentence", paper);
		pencil35.write(". Next test sentence.", paper);
		String actual = paper.getText();
		String expected = "Test sentence. Next test sentence.";
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPencilWritesALowercaseLetterItsPointDegradesByOne() {
		pencil5.write("ee", paper);
		int actual = pencil5.getPoint();
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPencilWritesWithNoPointItWritesSpaces() {
		pencil3.write("text", paper);
		String actual = paper.getText();
		String expected = "tex ";
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPencilIsSharpenedItRegainsItPoint() {
		pencil3.write("text", paper);
		pencil3.sharpen();
		int actual = pencil3.getPoint();
		int expected = 3;
		pencil3.write("more", paper);
		String actual2 = paper.getText();
		String expected2 = "tex mor ";
		assertEquals(expected, actual);
		assertEquals(expected2, actual2);	
	}
	
	@Test
	public void whenEraserErasesWordItErasesThatWord() {
		pencil14.write("text to go", paper);
		pencil14.erase("to", paper);
		String actual = paper.getText();
		String expected = "text    go";
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenEraserErasesWordItErasesLastInstanceOfThatWord() {
		pencil35.write("text to go go yeah", paper);
		pencil35.erase("go", paper);
		String actual = paper.getText();
		String expected = "text to go    yeah";
		assertEquals(expected, actual);
	}
}
