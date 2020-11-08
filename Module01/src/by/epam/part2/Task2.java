package by.epam.part2;

import java.io.*;

/**Найти max{min(a, b), min(c, d)}.*/
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int max = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("max = " + max);
    }
}
