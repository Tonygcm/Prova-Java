import java.util.Scanner;

public class Console {

    // private: apenas esta classe enxerga o "leitor"
    // static: esta classe gerencia o "leitor"
    private static Scanner leitor = new Scanner(System.in);

    // Método para ler e retornar um valor int:
    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    // Método para ler e retornar um valor float:
    public static float lerFloat() {
        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;
    }

    // Método para ler e retornar um valor String:
    public static String lerString() {
        return leitor.nextLine();
    }

    public static double lerDouble() {
        double valor = leitor.nextDouble();
        leitor.nextLine();
        return valor;
    }
}