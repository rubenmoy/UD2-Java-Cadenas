import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de carácteres");

        String cadena = sc.nextLine();

        String aux = "";

        for(int i=cadena.length()-1;i>=0;i--){
            aux = aux.concat(cadena.toLowerCase().substring(i,i+1));
        }

        if(cadena.toLowerCase().equals(aux)) System.out.println("El texto introducido es palíndromo");
        else System.out.println("El texto introducido no es palíndromo");

        sc.close();
    }
}
