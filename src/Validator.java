import java.util.Scanner;

/**
 * Created by Sharron 2/20/17
 */
public class Validator {
    Scanner scan = new Scanner(System.in);


    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt()) {//grabs another line of input
                i = sc.nextInt();
                isValid = true;
                
            }
            else {
                System.out.println("Invalid integer value. Try again.");
            }
            sc.nextLine();// discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt, int min, int max) {

        int i = 0;
        boolean isValid = false;//this verifies if statement is false
        while (isValid == false) {//loop to repeatedly prompt the user to get the interger
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println("Number must be " + min + " or greater.");//Sout validate using string method
            }else if  (i > max) {
                System.out.println("Number must be " + max + " or less.");
            }else
                isValid = true;
        }
        return i;//jumps back to original call location
    }

    public static double getDouble(Scanner sc, String prompt)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Invalid: " +  "Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            d = getDouble(sc, prompt);
            if (d < min)
                System.out.println("Number must be " + min + " or greater.");
            else if (d > max)
                System.out.println("Number must be " + max + " or less.");
            else
                isValid = true;
        }
        return d;
    }
}