package com.emiratalent.writers;

import com.emiratalent.operations.LowerCaseOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWriterTest {

    @Test
    void read() {
        Writer writer = new StringWriter();
        writer.write("HI");
        writer.apply(new LowerCaseOperation());
        writer.close();
        writer.write("ok");
        assertEquals("hi", writer.read());
    }
}