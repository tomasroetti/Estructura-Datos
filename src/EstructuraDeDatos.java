import java.util.Scanner;

public class EstructuraDeDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuál es tu nombre ?");
        String nombre = teclado.nextLine();
        System.out.println("Cual es tu edad ?");
        int edad = teclado.nextInt();
        System.out.println("Cual es tu número de telefono ?");
        int telefono = teclado.nextInt();
        System.out.printf("Tu nombre es %s tenes %d años y tu celular es %d", nombre, edad, telefono);

    }
}
