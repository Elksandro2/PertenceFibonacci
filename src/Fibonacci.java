import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número a verificar na sequência de Fibonacci: ");
        int numero = sc.nextInt();
        pertenceSequenciaFibonacci(numero);

        sc.close();

    }

    public static void pertenceSequenciaFibonacci(int numeroProcurado){
        int fib1 = 0, fib2 = 1, fib;
        while (fib1 <= numeroProcurado){
            if (fib1 == numeroProcurado){
                System.out.println("O número " + numeroProcurado + " pertence a sequência de Fibonacci!");
                return;
            }
            fib = fib1;
            fib1 = fib2;
            fib2 = fib1 + fib;
        }
        System.out.println("O número " + numeroProcurado + " não pertence a sequência de Fibonacci!");
    }

}