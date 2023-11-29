package vladyslav.goit;

public class IterativeFb {
    public static long fibonacci(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        long fib = 0;
        long prev1 = 1;
        long prev2 = 0;
        for (int i = 2; i <= number; i++) {
            fib = prev1 + prev2;
            prev2 = prev1;
            prev1 = fib;
        }
        return fib;
    }
}