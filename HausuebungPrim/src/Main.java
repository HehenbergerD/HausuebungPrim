import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Höchste Zahl eingeben:  ");
        int number = scanner.nextInt();
        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve(number);
        eratosthenesPrimeSieve.printPrimes();
    }
}