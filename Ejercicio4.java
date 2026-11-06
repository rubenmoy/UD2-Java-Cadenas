import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine();

        int contador = 0;

        for(int i = 0;i<frase.length();i++){

            if(frase.charAt(i)==' '){
                contador++;
            }
        }
        System.out.println("Hay " + (contador+1) + " palabras.");

        sc.close();
    }
}
