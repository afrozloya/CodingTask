package com.emiratalent.operations;

import com.emiratalent.writers.StringWriter;
import com.emiratalent.writers.Writer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpperCaseOperationTest {

    UpperCaseOperation operation = new UpperCaseOperation();
    @Test
    void execute() {
        Writer writer = new StringWriter();
        writer.write("OK kk");
        operation.execute(writer);
        assertEquals("OK KK", writer.getContent().toString());
    }
}