import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Instanciado el objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Pedimos e introducimos el valor de la cadena por teclado.
        
        System.out.println("Introduce una cadena por teclado");
        String c1 = sc.nextLine();
        System.out.println("Introduce un carácter:");
        String caracter = sc.nextLine();
        char a = (char)(caracter.charAt(0));
        int contador =0;

        //Recorremos la cadena y realizamos las instrucciones consecuentes

        for(int i=0;i<c1.length();i++){
            if(c1.toLowerCase().charAt(i)==a){
                contador++;
            }
        }
        System.out.println("El caracter " + a + " se ha encontrado " + contador + " veces.");

        sc.close();
    }
}
