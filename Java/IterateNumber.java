import java.util.Scanner;

public class IterateNumber {
    
    public static void main(String[] args) {
        
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        while(num != 0){

            int rem = num % 10;
            if(rem == 7){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
        in.close();
    }
}
