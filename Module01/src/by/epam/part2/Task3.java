package by.epam.part2;

import java.io.*;
/**Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.*/
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int y1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int y2 = Integer.parseInt(reader.readLine());
        int x3 = Integer.parseInt(reader.readLine());
        int y3 = Integer.parseInt(reader.readLine());
        if(x1 == x2 && x2 == x3) {
            System.out.println("Расположены на одной вертикали");
        } else if(y1 == y2 && y2 == y3) {
            System.out.println("Расположены на одной горизонтали");
        }

    }
}
