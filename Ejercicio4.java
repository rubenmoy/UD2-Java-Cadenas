import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Instanciado el objeto de la clase Scanner
        
        Scanner sc = new Scanner(System.in);

        //Pedimos e introducimos el valor de la cadena por teclado.

        System.out.println("Introduce una cadena por teclado");
        
        String frase = sc.nextLine();

        int contador = 0;

        //Recorremos la cadena y realizamos las instrucciones consecuentes

        for(int i = 0;i<frase.length();i++){

            if(frase.charAt(i)==' '){
                contador++;
            }
        }
        System.out.println("Hay " + (contador+1) + " palabras.");

        sc.close();
    }
}
