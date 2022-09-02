package com.emiratalent.operations;

import com.emiratalent.writers.StringWriter;
import com.emiratalent.writers.Writer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StupidRemovalOperationTest {

    StupidRemovalOperation operation = new StupidRemovalOperation();
    @Test
    void execute() {
        Writer writer = new StringWriter();
        writer.write("OK stupid kk Stupid");
        operation.execute(writer);
        assertEquals("OK s***** kk Stupid", writer.getContent().toString());
    }
}