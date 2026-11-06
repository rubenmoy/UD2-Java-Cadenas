import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        //Instanciado el objeto de la clase Scanner
        
        Scanner sc = new Scanner(System.in);

        //Pedimos e introducimos el valor de la cadena por teclado.

        System.out.println("Introduce una cadena por teclado");
        String cadena = sc.nextLine();

        System.out.println("Introduce dos caracteres por teclado");
        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);

        //Utilizamos el método replace perteneciente a la clase String para reemplazar dos carácteres de la cadena

        cadena = cadena.replace(a, b);

        System.out.println("La cadena ahora es " + cadena);

        sc.close();
    }
}
