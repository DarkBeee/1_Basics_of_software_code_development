package by.epam.part2;

import java.io.*;

/**Даны два угла треугольника (в градусах).
 Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.*/
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a =  Integer.parseInt(reader.readLine());
        int b =  Integer.parseInt(reader.readLine());
        if(a + b < 180 && a > 0 && b > 0) {
            System.out.println("Треугольник существует");
            if(a == 90 || b == 90 || a + b == 90) {
                System.out.println("Треугольник прямоугольный");
            }
        }
        else {
            System.out.println("Треугольник несуществует");
        }
    }
}
