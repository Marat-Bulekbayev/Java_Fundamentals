package javafundamentals;

public class MainTask {

    public static void main(String[] args) {
        try {
            int sumResult = Integer.parseInt(args[0]);
            int multiplyResult = Integer.parseInt(args[0]);

            for (int i = 1; i < args.length; i++) {
                sumResult += Integer.parseInt(args[i]);
                multiplyResult *= Integer.parseInt(args[i]);
            }

            System.out.println("Addition result: " + sumResult);
            System.out.println("Multiplication result: " + multiplyResult);

        } catch (NumberFormatException nfe) {
            System.out.println("Argument must be integer! " + nfe.getLocalizedMessage());
        }
    }
}