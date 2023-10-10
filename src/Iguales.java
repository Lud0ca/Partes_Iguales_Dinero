import java.util.Scanner;

public class Iguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto total a distribuir: ");
        double montoTotal = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de personas: ");
        int numPersonas = scanner.nextInt();

        int parteEntera = (int) (montoTotal / numPersonas);

        double montoSobrante = montoTotal - (parteEntera * numPersonas);

        for (int i = 1; i <= numPersonas; i++) {
            int cantidadActual = parteEntera;
            if (montoSobrante > 0) {
                cantidadActual++;
                montoSobrante--;
            }
            System.out.println("Persona " + i + ": " + cantidadActual);
        }

        scanner.close();
    }
}
