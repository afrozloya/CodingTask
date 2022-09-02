package com.emiratalent;

import com.emiratalent.operations.DuplicateRemovalOperation;
import com.emiratalent.operations.StupidRemovalOperation;
import com.emiratalent.operations.UpperCaseOperation;
import com.emiratalent.writers.FileWriter;
import com.emiratalent.writers.Writer;

public class EmiraTalentApp {
    public static void main(String[] args) {
        Writer writer = new FileWriter("ok.txt");
        writer.write("hi ok ok o ok");
        writer.write("stupid");
        writer.write("1111");
        writer.apply(new StupidRemovalOperation());
        writer.apply(new UpperCaseOperation());
        writer.apply(new DuplicateRemovalOperation());
        writer.close();
        writer.write("22222");
        System.out.println(writer.read());
    }
}
