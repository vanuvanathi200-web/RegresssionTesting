package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testMainMethod() {
        ByteArrayOutputStream outContent =
                new ByteArrayOutputStream();

        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            Main.main(new String[]{});

            assertEquals(
                    "Hello and welcome!",
                    outContent.toString().trim()
            );
        } finally {
            System.setOut(originalOut);
        }
    }
}