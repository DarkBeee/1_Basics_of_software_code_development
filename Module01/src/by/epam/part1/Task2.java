package by.epam.part1;

import java.io.*;

/**Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)*/
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a =  Double.parseDouble(reader.readLine());
        double b =  Double.parseDouble(reader.readLine());
        double c =  Double.parseDouble(reader.readLine());
        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("result = " + result);
    }
}
