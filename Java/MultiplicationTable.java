import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        System.out.println("Create Multiplication Table: ");
        System.out.print("Enter the number: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        createMultiplicationTable(num);

        in.close();
    }

    private static void createMultiplicationTable(int num) {

        for(int i = 0; i <= 10; i++){
            int result = num * i;
            System.out.println(num + " * " + i +" = " + result);
        }
    }
}
