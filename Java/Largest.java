import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        System.out.println("Enter the 3 numbers: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //int max = (a > b) && (b > c) ? a : (a < b) && (b < c) ? c : b;

        int max = Math.max(a, Math.max(c, b));

        System.out.println("Maximum Number is: " + max);

        input.close();
    }
            
}
