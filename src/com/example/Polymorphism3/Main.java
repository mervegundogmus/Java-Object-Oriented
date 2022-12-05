package com.example.Polymorphism3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader
                ("com/example/Polymorphism3/message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());
    }
}
