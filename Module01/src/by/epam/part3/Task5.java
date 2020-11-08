package by.epam.part3;

import java.io.*;

/**Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
 модуль которых больше или равен заданному е. Общий член ряда имеет вид:*/
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double e =  Double.parseDouble(reader.readLine());
        double sum = 0;
        for (int i = 0; i <= 10; i++){
            double a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (e <= Math.abs(a)) {sum = sum + a;}
            System.out.println("sum = " + sum);

        }
    }
}
