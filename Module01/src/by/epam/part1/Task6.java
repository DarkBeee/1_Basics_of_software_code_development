package by.epam.part1;

import java.io.*;

/**Для данной области составить линейную программу, которая печатает true,
 если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:*/
public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x =  Integer.parseInt(reader.readLine());
        int y =  Integer.parseInt(reader.readLine());
        if(x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println(true);
        } else if(x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
