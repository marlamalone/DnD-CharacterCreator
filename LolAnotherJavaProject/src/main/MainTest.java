package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    final void testDnDrace() {

	StringWriter output = new StringWriter();
	String input = "0\n";

	assertEquals(0, new PrintWriter(output));

	assertThat(output.toString(), contains("Dragonborn");

    }

    @Test
    final void testDnDclass() {

	StringWriter output = new StringWriter();
	String input = "0\n";

	assertEquals(0, new PrintWriter(output));

	assertThat(output.toString(), contains("Artificer");
	
    }

    @Test
    final void testDnDname() {
	
	StringWriter output = new StringWriter();
	String input = "My Name\n";

	assertEquals(0, new PrintWriter(output));

	assertThat(output.toString(), contains("My Name");
    }

    @Test
    final void testMain() {
        
	StringWriter output = newStringWriter();
	String inputRace = "Dragonborn";
	String inputClass = "Artificer";
	String inputName = "My Name";
	
	String message = "Congratulations on making your new character!\n
		Race: Dragonborn\n
		Class: Artificer\n
		Name: My Name");

	assertSame(newPrintWriter(message), new PrintWriter(output));

    }

}
