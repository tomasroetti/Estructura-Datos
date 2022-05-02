import java.util.Scanner;

public class EstructuraDeDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cúal es tu nombre?");
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Cuál es tu edad??");
        int edad = teclado.nextInt();
        System.out.println("Tu edad es " + edad + " años");
    }


}
