public class task3 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        int[] smallPrimes = {2, 3, 5, 7};

        for (int p : smallPrimes) {
            if (n == p) {
                return true;
            }
            if (n % p == 0) {
                return false;
            }
        }

        long d = n - 1;
        int s = 0;

        while (d % 2 == 0) {
            d /= 2;
            s++;
        }

        int[] bases = {2, 3, 5, 7};

        for (int base : bases) {
            long x = powerMod(base, d, n);

            if (x == 1 || x == n - 1) {
                continue;
            }

            boolean passed = false;

            for (int r = 1; r < s; r++) {
                x = (x * x) % n;

                if (x == n - 1) {
                    passed = true;
                    break;
                }
            }

            if (!passed) {
                return false;
            }
        }

        return true;
    }

    private static long powerMod(long base, long exponent, long mod) {
        long result = 1;
        base %= mod;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }

            base = (base * base) % mod;
            exponent /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(isPrime(n) ? "YES" : "NO");
    }
}