import java.util.Scanner;

public class TheNumbersDayOfDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" The Month: ");
        int month = scanner.nextInt();

        String daysOfMonth;
        switch (month) {
            case 2:
                daysOfMonth = " 28 or 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = " 31 ";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysOfMonth = " 30 ";
                break;
            default:
                daysOfMonth = "";
        }
        if (daysOfMonth != "") {
            System.out.println("The month " + month + " has " + daysOfMonth + " days!");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
