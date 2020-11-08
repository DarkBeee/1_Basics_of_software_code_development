package by.epam.part2;

import java.io.*;

/**Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 Определить, пройдет ли кирпич через отверстие.*/
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine()); // длина отверстия
        int B = Integer.parseInt(reader.readLine()); // ширина отверстия
        int x = Integer.parseInt(reader.readLine()); // длина кирпича
        int y = Integer.parseInt(reader.readLine()); // ширина кирпича
        int z = Integer.parseInt(reader.readLine()); // глубина кирпича
        if(x <= A && y <= B || x <= A && z <= B || y <= B && z <= A || x <= B && y <= A || z <= B && y <= A || z <= A && x <= B) {
            System.out.println("Кирпич пройдёт через отверстие");
        } else {
            System.out.println("Кирпич не пройдёт через отверстие");
        }
    }
}
