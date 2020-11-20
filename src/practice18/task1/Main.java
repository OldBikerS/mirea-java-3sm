package practice18.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int lastDecomposed = decompose(number);
        if(lastDecomposed != 1)
            System.out.println(lastDecomposed);
    }

    private static int decompose(int number) {
        for(int i = 2; i <= 9; i++) {
            if(number % i == 0) {
                number = number / i;
                System.out.println(i);
                if(number > 1) {
                    return decompose(number);
                }
                return number;
            }
        }
        return number;
    }
}