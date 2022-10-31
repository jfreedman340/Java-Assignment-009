import java.util.Arrays;
import java.util.Scanner;


public class ArrayProcessing {

    int[] array;
    Scanner scanner;

    public ArrayProcessing () {
        array = new int[5];
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }


    public void add () {
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println();
    }


    public void mult () {
        int result = 1;

        for(int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        System.out.println("Multiplication = " + result);
        System.out.println();
    }


    public void print () {
        System.out.println("Printing numbers: ");

        for(int i = 0; i < array.length; i++) {
            System.out.println("Number [" + i + "] = " + array[i]);
        }
        System.out.println();
    }


    public void reverse () {
        System.out.println("Printing numbers in reverse: ");

        for(int i = array.length - 1; i >= 0; i--) {
            System.out.println("Number [" + i + "] " + array[i]);
        }
        System.out.println();
    }


    public boolean again () {
        System.out.println("Enter integer 1 to choose another option, or 2 to exit: ");
        int num = scanner.nextInt();
        if (num == 1){
            return true;
        } else {
            return false;
        }
    }

    public void getNumbers () {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter number: ");
            int num = scanner.nextInt();
            array[i] = num;
        }
    }
    public void processNumbers () {
        String s;

        while(!(s = scanner.nextLine()).equalsIgnoreCase("Q")) {
            System.out.println("Choose an option to perform: \n" +
                    "1) Add numbers \n" +
                    "2) Multiply numbers \n" +
                    "3) Print numbers \n" +
                    "4) Print number in reverse ");
            System.out.println("Press Q twice to quit.");
            System.out.println("");

            switch (s) {
                case "1": add();
                    break;
                case "2": mult();
                    break;
                case "3": print();
                    break;
                case "4": reverse();
                    break;
                default: break;

            }
        }
    }


    public static void main(String[] args) {
        ArrayProcessing aP = new ArrayProcessing();

        aP.processNumbers();
    }
}
