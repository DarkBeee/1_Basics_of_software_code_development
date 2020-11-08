package by.epam.part1;

import static java.lang.Math.*;
import java.io.*;

/**Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях.
 Поменять местами дробную и целую части числа и вывести полученное значение числа.*/
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double a = floor(x);
        double result = rint((x - a) * 1000) + a / 1000;
        System.out.println("result = " + result);

    }
}
