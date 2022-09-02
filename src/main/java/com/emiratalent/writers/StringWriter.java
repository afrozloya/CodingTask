package com.emiratalent.writers;

public class StringWriter extends Writer {
    @Override
    public String read() {
        return content.toString();
    }

}
