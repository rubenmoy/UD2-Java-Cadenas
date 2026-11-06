import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Instanciado el objeto de la clase Scanner

        Scanner sc = new Scanner(System.in);

        //Pedimos e introducimos el valor de la cadena por teclado.

        System.out.println("INtroduce una cadena por teclado");

        String nombreCompleto = sc.nextLine();

        //Recorremos la cadena y realizamos las instrucciones consecuentes

        for(int i=0;i<nombreCompleto.length();i++){
            if(nombreCompleto.charAt(0)==nombreCompleto.charAt(i))System.out.println(nombreCompleto.charAt(i));
            else if (nombreCompleto.charAt(i)==' ') System.out.println(nombreCompleto.charAt(i+1));
        }
        sc.close();
    }
}
