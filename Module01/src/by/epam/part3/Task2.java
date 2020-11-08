package by.epam.part3;

import java.io.*;

/**Вычислить значение функции на отрезке [a,b] с шагом h:*/
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int h = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());
        int y;
        for (int i = a; i <= b; i += h) {
            if (x > 2) {
                x += i;
                y = x + i;
            } else {
                x += i;
                y = -x + i;
            }
            System.out.println("x = "+ x + " " + "y = " + y);
        }
    }
}
