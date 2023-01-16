package MathsPart2;

public class PrimeOptimised {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <=n ; i++) {
            System.out.println(i + " "  + isPrime(i));          // 2nd question is prime numbers till n from 2
        }
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        int c =2;
        while ( c * c <= n){  // coz sqrt(n) would look complex in code, sor for simplicity  c*c
            if (n % c == 0){
                return false;
            }
            c++;
        }
      return true;
    }
}
