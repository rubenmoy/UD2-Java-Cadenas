import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de carácteres por teclado:");

        String cadena = sc.nextLine();

        String invertida="";

        for(int i = cadena.length()-1;i>=0;i--){
            invertida = invertida.concat(cadena.substring(i,i+1));
        }

        System.out.println(invertida);

        sc.close();
    }
}