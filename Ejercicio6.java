import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Instanciado el objeto de la clase Scanner
        
        Scanner sc = new Scanner(System.in);

        //Pedimos e introducimos el valor de la cadena por teclado.

        System.out.println("Introduce una cadena de carácteres por teclado:");

        String cadena = sc.nextLine();

        String invertida="";

        //Recorremos la cadena y realizamos las instrucciones consecuentes

        for(int i = cadena.length()-1;i>=0;i--){
            invertida = invertida.concat(cadena.substring(i,i+1));
        }

        System.out.println(invertida);

        sc.close();
    }
}