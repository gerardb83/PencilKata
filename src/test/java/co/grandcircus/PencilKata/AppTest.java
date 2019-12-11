package co.grandcircus.PencilKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
   

	@Test
	public void whenPencilWritesOnPaperItStoresTheText() {
		Pencil pencil = new Pencil();
		Paper paper = new Paper();
		pencil.write("Test sentence", paper);
		String actual = paper.getText();
		String expected = "Test sentence";
		assertEquals(expected, actual);
	}
	
	
}
