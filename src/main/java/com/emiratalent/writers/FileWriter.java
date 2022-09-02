package com.emiratalent.writers;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter extends Writer {
    private final String fineName;
    private static final String outputFolder = "output/files/";

    public FileWriter(String fineName) {
        try {
            Files.createDirectories(Paths.get(outputFolder));
        } catch (IOException e) {
            System.out.println("Error creating output directory :: " +  e.getMessage());
        }
        this.fineName = fineName;
    }

    @Override
    public void close() {
        try {
            Files.write(Paths.get(outputFolder+fineName), content.toString().getBytes());
        } catch (IOException e) {
            System.out.println("Error writing to file :: " +  e.getMessage());
        }
        super.close();
    }
    @Override
    public String read() {
        String res = "";
        try {
            res = Files.readString(Paths.get(outputFolder+fineName));
        } catch (IOException e) {
            System.out.println("Error reading from file :: " +  e.getMessage());
        }
        return res;
    }
}
