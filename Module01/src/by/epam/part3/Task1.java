package by.epam.part3;

import java.io.*;

/**Напишите программу, где пользователь вводит любое целое положительное число.
 А программа суммирует все числа от 1 до введенного пользователем числа.*/
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int sum = 0;
        for(int i = 1; i < x; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
