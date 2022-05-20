import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci");
        System.out.println("How many numbers?: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count < num ){
            int temp = b;
            b = a + b;
            a = temp;
            count++;

            System.out.print(b + " ");
        }

        in.close();
    }
}
