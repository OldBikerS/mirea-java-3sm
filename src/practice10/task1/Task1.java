package practice10.task1;
import java.util.Scanner;
public class Task1 {
    public Task1(){
        int k, d;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        d = sc.nextInt();
        int min = (int)Math.pow(10, k - 1);
        int max = (int)Math.pow(10, k);
        int count = 0, sum, num;
        for (int i = min; i < max; i++) {
            sum = 0;
            num = i;
            while (num != 0){
                sum += num%10;
                num /= 10;
            }
            if (sum == d)
                count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println ( "Введите k и s:" );
        new Task1 ( );
    }
}
