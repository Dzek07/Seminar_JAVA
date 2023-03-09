import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iscanner = new Scanner(System.in);

        System.out.print("Вывести все простые числа от 1 до ");
        Integer n = iscanner.nextInt();
        
        

        for (int i = 1; i < n+1; i++) {
            Integer count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2){
                System.out.print(i + ", ");
            }
        }
        
        
        
    }
}