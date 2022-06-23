package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("AlfavitSyfry.txt");

        for (char c = 'A'; c <= 'z'; c++) {
            String s = new String();
            s += c;
            writer.write("\n" + s);

            if (c == 'Z') c = 'a' - 1;
        }

        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i);
            writer.write("\n" + s);
        }

        writer.close();

        FileReader reader = new FileReader("AlfavitSyfry.txt");
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());
        reader.close();

    }
}
