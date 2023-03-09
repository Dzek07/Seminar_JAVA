import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iscanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        Integer firstNumber = iscanner.nextInt();
        System.out.print("Введите действие + - * / ");
        String action = iscanner.next();
        System.out.print("Введите второе число: ");
        Integer secondNumber = iscanner.nextInt();

        Integer result = 0;
        Integer sum = 0;
        Integer minus = 0;
        Integer multiply = 0;
        Integer division = 0;

        sum = action.compareTo("+");
        minus = action.compareTo("-");
        multiply = action.compareTo("*");
        division = action.compareTo("/");
        if (sum == 0){
            result = firstNumber + secondNumber;
            System.out.println(result);
            System.exit(0);
        }
        if (minus == 0){
            result = firstNumber - secondNumber;
            System.out.println(result);
            System.exit(0);
        }
        if (multiply == 0){
            result = firstNumber * secondNumber;
            System.out.println(result);
            System.exit(0);
        }
        if (division == 0){
            if (secondNumber == 0){
                System.out.println("Делить на 0 нельзя");
                System.exit(0);
            }
            result = firstNumber / secondNumber;
            System.out.println(result);
            System.exit(0);
        }
    }
}