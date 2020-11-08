package by.epam.part3;

import java.io.*;

/**Для каждого натурального числа в промежутке от m до n вывести все делители,
 кроме единицы и самого числа. m и n вводятся с клавиатуры.*/
public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for( ; m < n; m++) {
            System.out.print("Число " + m + " делится на: ");
            for(int i = 2; i < m; i++) {
                if(m % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}

