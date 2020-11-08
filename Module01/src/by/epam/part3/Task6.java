package by.epam.part3;

/**Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.*/
public class Task6 {
    public static void main(String[] args) {
        for(int i = 32; i < 1000; i++) {
            System.out.println("i = " + i + ", char = " + (char) i);
        }
    }
}
