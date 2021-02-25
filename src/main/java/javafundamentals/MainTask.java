package javafundamentals;

public class MainTask {

    public static void main(String[] args) {
        System.out.print("Hello, ");

        for (String letter : args) {
            System.out.print(letter);
        }

        System.out.println("!");
  
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
      
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