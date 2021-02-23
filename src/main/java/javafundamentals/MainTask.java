package javafundamentals;

public class MainTask {
  
    public static void main(String[] args) {
        System.out.print("Hello, ");

        for (String letter : args) {
            System.out.print(letter);
        }

        System.out.println("!");
    }
}
