public class task2 {
    public static double logFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть неотрицательным");
        }

        if (n <= 1) {
            return 0.0;
        }

        return Math.log(n) + logFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(logFactorial(n));
    }
}