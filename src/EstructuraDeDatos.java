import java.util.Scanner;

public class EstructuraDeDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de propinas");
        System.out.println("Ingrese la cantidad a pagar");
        double cantpropinas = teclado.nextDouble();
        System.out.println();
        System.out.println("Ingrese el % de propina");
        int porcentaje = teclado.nextInt();
        double total = 0.0D;
        if (porcentaje < 15) {
            System.out.println("El servicio no fue bueno ");
            total = cantpropinas / (double)porcentaje * 100.0D;
            System.out.printf("El total de propina es de %.1f ", total);
        } else if (15 <= porcentaje && porcentaje < 30) {
            total = cantpropinas / (double)porcentaje * 100.0D;
            System.out.printf("El total de propina es de %.1f ", total);
        } else {
            System.out.println("El servicio fue excelente");
            total = cantpropinas / (double)porcentaje * 100.0D;
            System.out.printf("El total de propina es de %.1f ", total);
        }

    }

}
