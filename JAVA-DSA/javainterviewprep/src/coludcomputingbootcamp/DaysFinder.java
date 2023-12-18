package coludcomputingbootcamp;

public class DaysFinder {

    public static void monthfinder(int m) {
        if (m >= 1 && m <= 12) {
            switch (m) {
             	case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("days 30");
                    break;
                case 2:
                    System.out.println("days 28");
                    break;
                default:
                    System.out.println("days 31");
            }
        } else {
            System.out.println("Enter a valid input (1-12)");
        }
    }

    public static void main(String[] args) {
        int month = 1; 
        monthfinder(month);
    }
}
