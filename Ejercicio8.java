import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto por teclado");

        String cadena = sc.nextLine();

        String aux = "";

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
