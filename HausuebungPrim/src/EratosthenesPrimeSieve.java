public class EratosthenesPrimeSieve implements PrimeSieve{

    int maxNumber;

    public EratosthenesPrimeSieve(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 2; i < maxNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}