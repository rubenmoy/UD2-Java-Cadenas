import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        //Instanciado el objeto de la clase Scanner
        
        Scanner sc = new Scanner(System.in);

        //Pedimos e introducimos el valor de la cadena por teclado.

        System.out.println("Introduce una cadena de carácteres");

        String cadena = sc.nextLine();

        String aux = "";

        //Recorremos la cadena y realizamos las instrucciones consecuentes

        for(int i=cadena.length()-1;i>=0;i--){
            aux = aux.concat(cadena.toLowerCase().substring(i,i+1));
        }

        //COmprobamos si la palabra es palíndroma con el metodo .equals() de la clase String

        if(cadena.toLowerCase().equals(aux)) System.out.println("El texto introducido es palíndromo");
        else System.out.println("El texto introducido no es palíndromo");

        sc.close();
    }
}
