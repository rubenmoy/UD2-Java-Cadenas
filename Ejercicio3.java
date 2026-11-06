import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena por teclado");
        String c1 = sc.nextLine();
        System.out.println("Introduce un carácter:");
        String caracter = sc.nextLine();
        char a = (char)(caracter.charAt(0));
        int contador =0;
        for(int i=0;i<c1.length();i++){
            if(c1.toLowerCase().charAt(i)==a){
                contador++;
            }
        }
        System.out.println("El caracter " + a + " se ha encontrado " + contador + " veces.");
        sc.close();
    }
}
