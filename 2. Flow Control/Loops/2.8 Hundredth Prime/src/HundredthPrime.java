public class HundredthPrime {
   public static void main(String[] args) {
      int count = 0; // Count of prime numbers found
      int number = 2; // Starting with the first prime number

      while (count < 100) {
         if (isPrime(number)) {
            count++;
            if (count == 100) {
               System.out.println(number);
            }
         }
         number++;
      }
   }

   // Method to check if a number is prime
   public static boolean isPrime(int n) {
      if (n <= 1) {
         return false;
      }
      if (n <= 3) {
         return true;
      }
      if (n % 2 == 0 || n % 3 == 0) {
         return false;
      }
      for (int i = 5; i * i <= n; i += 6) {
         if (n % i == 0 || n % (i + 2) == 0) {
            return false;
         }
      }
      return true;
   }
}
