import java.util.Scanner;

public class Main {

    public static class BinaryFormatException extends Exception {
        public BinaryFormatException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        try {
            int dec = Integer.parseInt(binaryString, 2);
            System.out.println(dec);
            return dec;
        } catch (NumberFormatException e) {
            throw new BinaryFormatException("Not a binary number!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryString = sc.next();
        sc.close();
        
        try {
            bin2Dec(binaryString);
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}