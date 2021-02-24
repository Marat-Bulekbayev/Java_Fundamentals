package javafundamentals;

public class MainTask {

    public static String[] arrayOfMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        try {
        System.out.println("Entered number indicates the month: " + getMonthName(Integer.parseInt(args[0])));
        } catch (NumberFormatException nfe) {
            System.out.println("Entered argument must be integer! " + nfe.getLocalizedMessage());
        }
    }

    public static String getMonthName(int numberOfMonth) {
        if (numberOfMonth > 0 && numberOfMonth < 13) {
            return arrayOfMonths[numberOfMonth - 1];
        } else {
            return "Error! You must enter integer from 1 to 12.";
        }
    }
}
