public class primeornot {
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int testNumber = 29; // Change this number to test others
        
        if (isPrime(testNumber)) {
            System.out.println(testNumber + " is prime");
        } else {
            System.out.println(testNumber + " is not prime");
        }
    }
}
