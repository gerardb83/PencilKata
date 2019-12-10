package co.grandcircus.PencilKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
   
	@Test
    public void whenPencilWritesTextItStoresWrittenText() {
    	Pencil pencil = new Pencil();
    	String actual = pencil.write("Test sentence");
    	String expected = "Test sentence";
        assertEquals(expected, actual);
    }
}
