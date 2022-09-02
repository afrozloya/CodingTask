package com.emiratalent.writers;

import com.emiratalent.operations.LowerCaseOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {

    @Test
    void read() {
        Writer writer = new FileWriter("test.txt");
        writer.write("HI");
        writer.apply(new LowerCaseOperation());
        writer.close();
        writer.write("ok");
        assertEquals("hi", writer.read());
    }
}