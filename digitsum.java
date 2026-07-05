public class digitsum {

    public static int getSumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n); 
        
        while (n > 0) {
            sum += n % 10; 
            n = n / 10;    
        }
        return sum;
    }
    public static void main(String[] args) {
        int number = 12345; 
        
        int result = getSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + result);
    }
}
