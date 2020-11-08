package by.epam.part3;

import java.util.*;
import java.io.*;

/**Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/
public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        Set<String> list = new HashSet<String>();
        for(int i = 0; i < a.length(); i++) {
            for(int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    list.add(b.substring(j, j + 1));
                }
            }
        }
        System.out.println("Повторяющиеся цифры: " + list.toString());
    }
}
