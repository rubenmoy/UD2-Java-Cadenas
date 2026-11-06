import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena por teclado");
        String cadena = sc.nextLine();
        System.out.println("Introduce dos caracteres por teclado");
        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        cadena = cadena.replace(a, b);
        System.out.println("La cadena ahora es " + cadena);
        sc.close();
    }
}
