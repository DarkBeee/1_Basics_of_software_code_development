package by.epam.part3;

/**Найти сумму квадратов первых ста чисел.*/
public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 101; i++) {
            sum = sum + (int) Math.pow(i, 2);
        }
        System.out.println("sum = " + sum);
    }
}
