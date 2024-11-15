package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        double result = 0;

        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (bufferedReader.ready()) {
            String[] chunks = bufferedReader.readLine().split(" ");
            for (String chunk : chunks) {
                double num = 0;
                try {
                    num = Double.parseDouble(chunk);
                } catch (RuntimeException e) {
                }
                result += num;
            }
        }
        System.out.printf(Locale.US, "%.6f", result);
    }
}
