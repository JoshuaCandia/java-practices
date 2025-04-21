package FinalProject;

import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        int age, grade1, grade2, grade3;
        double average;
        String newData;
        boolean repeat = true;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese su edad:");
            age = scanner.nextInt();

            if (age < 18) {
                System.out.println("Es menor de edad, vuelva cuando cumpla 18.");
            } else {
                System.out.println("Ingrese la primera calificación:");
                grade1 = scanner.nextInt();

                System.out.println("Ingrese la segunda calificación:");
                grade2 = scanner.nextInt();

                System.out.println("Ingrese la tercera calificación:");
                grade3 = scanner.nextInt();

                average = (grade1 + grade2 + grade3) / 3.0;

                if (average >= 6) {
                    System.out.printf("Aprobado con: %.2f%n", average);
                } else {
                    System.out.printf("Desaprobado con: %.2f%n", average);
                }
            }

            System.out.println("¿Desea ingresar nuevos datos? Escriba 'si' o 'no':");
            newData = scanner.next();

            if (!newData.equalsIgnoreCase("si")) {
                repeat = false;
            }

        } while (repeat);

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
