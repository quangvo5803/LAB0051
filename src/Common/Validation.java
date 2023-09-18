package Common;

import java.util.Scanner;

public class Validation {
    static Scanner sc = new Scanner(System.in);

    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInt(prompt);
            if (i < min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (i > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            } else
                isValid = true;
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value.Try again");
            }
            sc.nextLine();
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            d = getDouble(prompt);
            if (d < min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (d > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            } else
                isValid = true;
        }
        return d;
    }

    public static String getOperator() {
        String result = "";
        boolean check = true;
        do {
            System.out.print("Enter operator: ");
            String tmp = sc.nextLine();
            if (!tmp.isEmpty() && (tmp.equalsIgnoreCase("+") || tmp.equalsIgnoreCase("-"))
                    || tmp.equalsIgnoreCase("*") || tmp.equalsIgnoreCase("/")
                    || tmp.equalsIgnoreCase("^") || tmp.equalsIgnoreCase("=")) {
                result = tmp;
                check = false;
            } else {
                System.out.println("Enter the wrong type, please re-enter (+, -, *, /, ^)!");
            }

        } while (check);
        return result;
    }
}
