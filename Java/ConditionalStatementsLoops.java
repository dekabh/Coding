import java.util.Scanner;

public class ConditionalStatementsLoops {
    
    public static void main(String[] args) {
        
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i < n; i++){

            System.out.print(i + " ");

        }

        input.close();
        
    }
}
