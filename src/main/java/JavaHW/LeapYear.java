package JavaHW;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year from 1900 to 2016): ");
        int year = scanner.nextInt();

        if (year < 1900 || year > 2016) {
            System.out.println("Wrong input");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("February has 29 days in " + year);
        } else {
            System.out.println("February has 28 days in " + year);
        }
    }
}
