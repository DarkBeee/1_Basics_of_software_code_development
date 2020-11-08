package by.epam.part1;

import java.io.*;

/**Найдите значение функции: z = ((a – 3) * b / 2) + c.*/
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("a:");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("b:");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("c:");
        double c = Double.parseDouble(reader.readLine());
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }
}
