package by.epam.part1;

import java.io.*;

/**Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
 Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 HHч MMмин SSс.*/
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x =  Integer.parseInt(reader.readLine());
        int hours = x / 3600;
        int minutes = (x % 3600) / 60;
        int seconds = ((x % 3600)) % 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c");

    }
}
