import java.util.Scanner;

public class EstructuraDeDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos número queres ingresar?");
        int numero = teclado.nextInt();
        System.out.printf("Ingrese %d datos\n", numero);

        for(int contador = 1; contador <= numero; ++contador) {
            System.out.printf("Dato  %d: ", contador);
            int entrada = teclado.nextInt();
            int resultado = entrada * 2;
            System.out.printf("El dato procesado vale %d\n", resultado);
        }

    }

}
