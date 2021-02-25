package javafundamentals;

public class MainTask {

    public static String[] arrayOfMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        try {
            System.out.println("Entered number indicates the month: " + getMonthName(Integer.parseInt(args[0])));
            System.out.println("Entered number indicates the month: " + getNameOfTheMonth(Integer.parseInt(args[0])));
        } catch (Exception e) {
            System.out.println("Entered argument must be integer! " + e.getLocalizedMessage());
        }
    }

    public static String getMonthName(int numberOfMonth) {
        if (numberOfMonth > 0 && numberOfMonth < 13) {
            return arrayOfMonths[numberOfMonth - 1];
        } else {
            return "Error! You must enter integer from 1 to 12.";
        }
    }

    public static String getNameOfTheMonth(int numberOfMonth) throws Exception {
        String monthName;

        switch (numberOfMonth) {
            case 1 :
                monthName = "January";
                break;
            case 2 :
                monthName = "February";
                break;
            case 3 :
                monthName = "March";
                break;
            case 4 :
                monthName = "April";
                break;
            case 5 :
                monthName = "May";
                break;
            case 6 :
                monthName = "June";
                break;
            case 7 :
                monthName = "July";
                break;
            case 8 :
                monthName = "August";
                break;
            case 9 :
                monthName = "September";
                break;
            case 10 :
                monthName = "October";
                break;
            case 11 :
                monthName = "November";
                break;
            case 12 :
                monthName = "December";
                break;
            default :
                throw new Exception("Error! You must enter integer from 1 to 12.");
        }

        return monthName;
    }
}
