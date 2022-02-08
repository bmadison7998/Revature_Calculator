package com.company;
import java.util.Scanner;

public class Main {
    public static int get_int(Scanner input){
        // init the scanner in main and passed it as a parameter because, IDK.
        // gets an input with the scanner and validates it, after that, the value is returned for use in the program.
        // using a do-while because recursion is bad on memory
        int temp;
        boolean flag = true;
        do {
            temp = input.nextInt();
            if (input.hasNextInt()) {
                // makes sure that the value grabbed is a double
                // ends the do while
                flag = false;
            } else {
                System.out.println("Please enter a valid double");
            }
        }while(flag);
        return temp;
    }
    public static double get_double(Scanner input){
        // using a do-while because recursion is bad on memory
        // gets an input with the scanner and validates it, after that, the value is returned for use in the program.
        double temp;
        boolean flag = true;
        do {
            temp = input.nextDouble();
            if (input.hasNextDouble()) {
                // makes sure that the value grabbed is a double
                // ends the do while
                flag = false;
            } else {
                System.out.println("Please enter a valid double");
            }
        }while(flag);
        return temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What operation would you like to do?");
        System.out.println("1 - Add '\n'2 - Subtract'\n'3 - Multiply'\n'4 - Divide");


        String operation = "";
        // holds the operation we will do
            switch (get_int(input)) {
                case 1:
                    operation = "add";
                    break;
                case 2:
                    operation = "subtract";
                    break;
                case 3:
                    operation = "multiply";
                    break;
                case 4:
                    operation = "divide";
                    break;
                default:
                    System.out.println("Enter a valid integer between 1 and 4.");
                    break;
            }

        System.out.println("What two numbers do you want to operate on?");
        switch(operation){
            case "add":
                System.out.println(get_double(input)+get_double(input));
                System.out.println("is the answer.");
                break;
            case "subtract":
                System.out.println(get_double(input)-get_double(input));
                System.out.println("is the answer.");
                break;
            case "multiply":
                System.out.println(get_double(input)*get_double(input));
                System.out.println("is the answer.");
                break;
            case "divide":
                System.out.println(get_double(input)/get_double(input));
                System.out.println("is the answer.");
                break;
            default:
                System.out.println("oh no!");
                break;
        }
    }
}
