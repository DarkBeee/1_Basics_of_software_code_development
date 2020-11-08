package by.epam.part1;

import java.io.*;
import static java.lang.Math.*;

/**Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 ((sin(x1) + cos(y2)) / (cos(x2) - sin(y1))) * (tan(x3) + tan(y3))*/
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x1 = Double.parseDouble(reader.readLine());
        x1 = toRadians(x1); // sin x
        double x2 = x1; // cos x
        double x3 = sin(x1) / cos(x2); // tg x
        double y1 = Double.parseDouble(reader.readLine());
        y1 = toRadians(y1); // sin y
        double y2 = y1; // cos y
        double y3 = sin(y1) / cos(y2); // tg y
        double result = ((sin(x1) + cos(y2)) / (cos(x2) - sin(y1))) * (tan(x3) + tan(y3));
        System.out.println("result = " + result);
    }
}
