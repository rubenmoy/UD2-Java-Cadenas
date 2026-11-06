import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreCompleto = sc.nextLine();

        for(int i=0;i<nombreCompleto.length();i++){
            if(nombreCompleto.charAt(0)==nombreCompleto.charAt(i))System.out.println(nombreCompleto.charAt(i));
            else if (nombreCompleto.charAt(i)==' ') System.out.println(nombreCompleto.charAt(i+1));
        }
        sc.close();
    }
}
