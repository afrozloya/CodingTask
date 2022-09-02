package com.emiratalent.operations;

import com.emiratalent.writers.StringWriter;
import com.emiratalent.writers.Writer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowerCaseOperationTest {

    LowerCaseOperation operation = new LowerCaseOperation();
    @Test
    void execute() {
        Writer writer = new StringWriter();
        writer.write("OK kk");
        operation.execute(writer);
        assertEquals("ok kk", writer.getContent().toString());
    }
}