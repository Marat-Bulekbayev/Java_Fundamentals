package javafundamentals;

public class MainTask {

    public static void main(String[] args) {
        try {
            for (String iterator : args) {
                System.out.print(Integer.parseInt(iterator) + " ");
            }

            System.out.print("\n");

            for (String iterator : args) {
                System.out.println(Integer.parseInt(iterator));
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Argument must be integer! " + nfe.getLocalizedMessage());
        }
    }
}