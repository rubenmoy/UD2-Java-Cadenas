import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Instanciado el objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Pedimos e introducimos el valor de la cadena por teclado.
        System.out.println("Introduce una cadena de texto por teclado:");
        String c1 = sc.nextLine();
        System.out.println("Introduce una cadena mas pequeña por teclado");
        String c2 = sc.nextLine();

        //Comprobamos la cadena y realizamos las instrucciones consecuentes

        if (c1.toLowerCase().startsWith(c2.toLowerCase())) {
            System.out.println("La cadena comienza con la subcadena");
        }else System.out.println("La cadena no comienza con la subcadena");

        sc.close();
    }
}
