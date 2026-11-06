import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        //Instanciado el objeto de la clase Scanner
        
        Scanner sc = new Scanner(System.in);

        //Pedimos e introducimos el valor de la cadena por teclado.

        System.out.println("Introduce una cadena por teclado");

        String cadena = sc.nextLine();

        System.out.println("Introduce una subcadena");

        String subcadena = sc.nextLine();

        //Recorremos la cadena y realizamos las instrucciones consecuentes

        if(cadena.toLowerCase().contains(subcadena.toLowerCase())) {

            System.out.println("La subcadena está contenida en la cadena principal.");

        }else System.out.println("No se encontró la subcadena en la cadena principal.");

        sc.close();
    }
}
