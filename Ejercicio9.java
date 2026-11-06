import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena por teclado");

        String cadena = sc.nextLine();

        System.out.println("Introduce una subcadena");

        String subcadena = sc.nextLine();

        if(cadena.toLowerCase().contains(subcadena.toLowerCase())) {

            System.out.println("La subcadena está contenida en la cadena principal.");

        }else System.out.println("No se encontró la subcadena en la cadena principal.");

        sc.close();
    }
}
