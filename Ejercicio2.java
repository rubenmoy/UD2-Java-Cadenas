import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto por teclado:");
        String c1 = sc.nextLine();
        System.out.println("Introduce una cadena mas pequeña por teclado");
        String c2 = sc.nextLine();
        if (c1.toLowerCase().startsWith(c2.toLowerCase())) {
            System.out.println("La cadena comienza con la subcadena");
        }else System.out.println("La cadena no comienza con la subcadena");
        sc.close();
    }
}
