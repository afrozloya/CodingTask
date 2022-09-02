package com.emiratalent.operations;

import com.emiratalent.writers.StringWriter;
import com.emiratalent.writers.Writer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateRemovalOperationTest {

    DuplicateRemovalOperation operation = new DuplicateRemovalOperation();
    @Test
    void execute() {
        Writer writer = new StringWriter();
        writer.write("ok is is bla");
        operation.execute(writer);
        assertEquals("ok is bla", writer.getContent().toString());
    }
}