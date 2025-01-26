package model.menuServices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuInput {

    public static int input() throws InputMismatchException {
        Scanner read = new Scanner(System.in);
        int input = 0;
        while (true) {
            try {
                input = read.nextInt();
                return input;
            } catch (InputMismatchException e) {
                MenuPrinter.print("ERROR: INVALID INPUT! Please enter a valid number: ");
                read.nextLine();
            }
        }
    }

}
