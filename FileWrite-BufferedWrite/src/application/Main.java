package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\iagom\\Documents\\out.txt";
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e ) {
            e.printStackTrace();
        }
    }
}