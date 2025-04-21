package Scanner;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        System.out.println("Ingrese un número");

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        System.out.println("Ingrese otro número");
        int secondNumber = sc.nextInt();

        System.out.println("La suma da = " + (firstNumber + secondNumber));
    }
}