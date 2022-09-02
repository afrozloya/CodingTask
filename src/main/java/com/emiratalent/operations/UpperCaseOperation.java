package com.emiratalent.operations;

import com.emiratalent.writers.Writer;

public class UpperCaseOperation implements Operation{
    @Override
    public void execute(Writer writer) {
        writer.setContent(new StringBuilder(writer.getContent().toString().toUpperCase()));
    }
}
