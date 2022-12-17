package BE_JV_001_LDP01.Aulas;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        double a = scanner.nextInt();
        System.out.print("Informe o segundo numero: ");
        double b = scanner.nextInt();

        System.out.println("Resultado da soma = "+somar(a,b));
        System.out.println("Resultado da substração = "+subtrair(a,b));
        System.out.println("Resultado da multiplicação = "+multiplicar(a,b));
        System.out.println("Resultado da divisão = "+dividir(a,b));
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0d;
        }
        return a / b;
    }
}
