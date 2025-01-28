import java.util.Scanner;
public class LeapYr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input
        int year = sc.nextInt(); 
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year"); // If leap year
        } else {
            System.out.println("Not a leap year"); // If not leap year
        }
        sc.close(); 
    }
}
