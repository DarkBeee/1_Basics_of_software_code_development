package by.epam.part2;

import java.io.*;

/**Вычислить значение функции*/
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double result = 0;
        if(x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else if(x > 3) {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("result = " + result);
    }
}
