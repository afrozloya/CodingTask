package com.emiratalent.writers;

import com.emiratalent.operations.Operation;

public abstract class Writer {
    protected StringBuilder content;
    private boolean closed;

    public StringBuilder getContent() {
        return content;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }

    protected Writer() {
        this.closed = false;
        content = new StringBuilder("");
    }

    public boolean isClosed() {
        return closed;
    }

    public void write(String str){
        if(!isClosed())
            content.append(str);
    }
    public void close() {
        this.closed = true;
    }
    public void apply(Operation operation) {
        if(!isClosed())
            operation.execute(this);
    }

    public abstract String read();
}
