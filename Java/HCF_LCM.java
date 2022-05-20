import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        
        System.out.print("Enter 2 numbers: ");
        System.out.println("num1: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int hcf = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1,num2);

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

        in.close();
    }

    private static int calculateLCM(int num1, int num2) {
        int max = Math.max(num1,num2);

        int count = max;
        int lcm = 0;

        while(true){
            if(max % num1 == 0 && max % num2 == 0){
                lcm = max;
                break;
            }
            max += count;
        }
        return lcm;        
    }

    private static int calculateGCD(int num1, int num2) {
        
        if(num1 % num2 == 0){
            return num2;
        }
        num1 = num1 % num2;
        return  calculateGCD(num2,num1);
    }
}
