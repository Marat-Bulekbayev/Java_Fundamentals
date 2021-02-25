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
    }
}