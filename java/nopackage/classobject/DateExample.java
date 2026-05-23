
import java.util.Scanner;

public class DateExample {
    public static void main(String[] args) {
        Date d = new Date();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        d.setDay(scanner.nextInt());

        System.out.print("Enter month: ");
        d.setMonth(scanner.nextInt());

        System.out.print("Enter year: ");
        d.setYear(scanner.nextInt());

        System.out.printf("%02d/%02d/%d\n", d.getDay(), d.getMonth(), d.getYear());
    }
}