import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        //Instanciado el objeto de la clase Scanner
        
        Scanner sc = new Scanner(System.in);

        //Pedimos e introducimos el valor de la cadena por teclado.

        System.out.println("Introduce una cadena de texto por teclado");

        String cadena = sc.nextLine();

        String aux = "";

        //Recorremos la cadena y realizamos las instrucciones consecuentes

        for(int i=0;i<cadena.length();i++){
            if(cadena.toLowerCase().charAt(i)==cadena.charAt(i)){
                aux = aux.concat(cadena.toUpperCase().substring(i, i+1));
            }else if (cadena.toUpperCase().charAt(i)==cadena.charAt(i)){aux = aux.concat(cadena.toLowerCase().substring(i,i+1));}
            else aux = aux.concat(cadena.substring(i, i+1));
        }
        
        System.out.println(aux);
        
        sc.close();
    }
}
