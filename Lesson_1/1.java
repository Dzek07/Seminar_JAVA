import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iscanner = new Scanner(System.in);

        System.out.print("Введите количество n чисел: ");
        Integer n = iscanner.nextInt();
        Integer summ = 0;
        Integer factorial = 1;
        for (int i = 1; i <= n; i++) {
           summ = summ + i;
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        
        System.out.println("треугольного число = " + summ);
        System.out.println("Факториал = " + factorial);
    }
}