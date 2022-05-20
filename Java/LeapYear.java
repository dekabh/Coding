import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        
        System.out.print("Enter a year: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        boolean leapYearFlag = isLeapYear(num);

        if(leapYearFlag)
            System.out.println("Leap Year");
        else
            System.out.println("Not a leap year");
        
        in.close();
    }

    private static boolean isLeapYear(int year) {

        boolean isleap = false;

        if(year % 4 == 0 && year % 400 == 0)
            isleap = true;
        return isleap;
    }
}
