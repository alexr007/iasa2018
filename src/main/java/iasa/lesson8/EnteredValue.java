package iasa.lesson8;

import java.util.Scanner;

public class EnteredValue {

    public int value() {
        System.out.print("Enter the value:");

        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
}
