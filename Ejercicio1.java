import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();
        for(int i = 0;i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }
        sc.close();
    }
}
