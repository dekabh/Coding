import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        System.out.print("Enter the Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Reverse of" + num + " becomes: " + revNum(num));

        in.close();
    }

    private static int revNum(int num) {
        int rev = 0;

        while(num != 0){

            int rem = num % 10;
            num /= 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
}
