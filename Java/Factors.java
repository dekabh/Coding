import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        generateFactors(num);

        in.close();
        
    }

    private static void generateFactors(int num) {

        

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                
            }
        }
    }
}
