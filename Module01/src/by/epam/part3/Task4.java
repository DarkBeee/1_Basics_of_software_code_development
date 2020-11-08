package by.epam.part3;

/**Составить программу нахождения произведения квадратов первых двухсот чисел.*/
public class Task4 {
    public static void main(String[] args) {
        long sum = 1;
        for (int i = 1; i < 201; i++) {
            sum *= Math.pow(i, 2);
        }
        System.out.println("sum = " + sum);
    }
}
