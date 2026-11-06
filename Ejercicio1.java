import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Instanciado el objeto de la clase Scanner

        Scanner sc = new Scanner(System.in);
        
        //Pedimos e introducimos el valor de la cadena por teclado.
        
        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();
        
        //Recorremos la cadena y realizamos las instrucciones consecuentes
        for(int i = 0;i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }
        sc.close();
    }
}
