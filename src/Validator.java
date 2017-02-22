import java.util.Scanner;

/**
 * Created by Sharron 2/20/17
 */
public class Validator {


    public static String getString(Scanner sc, String prompt) {//should only return a string
        System.out.print(prompt);//this displays to the counsel the message from user input
        String s = sc.next();  // read user entry//turns everything into a string
        sc.nextLine();  // discard any other data entered on the line
        return s;//returning a string that came from the scanner input
    }

    public static int getInt(Scanner sc, String prompt) {//should return an integer only
        int i = 0;//interger is set to zero
        boolean isValid = false;//initializing a beginning value to false
        while (isValid == false)//while loop repeats the code inside the loop until it returns isValid to true
        {
            System.out.print(prompt);
            if (sc.hasNextInt()) {//looks to see if there's a next integer to get/runs once
                i = sc.nextInt();//scanner grabs the next integer
                isValid = true;//set this to a different value if integer is found
                
            }
            else {
                System.out.println("Invalid integer value. Try again.");//if no int found message to user displayed
                //tell user to go back through the loop & try it again
            }
            sc.nextLine();// discard any other data entered on the line
        }//this goes back to the top of while loop to run the text again
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

    public static double getDouble(Scanner sc, String prompt, double min, double max) {//this one checks double & in range
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