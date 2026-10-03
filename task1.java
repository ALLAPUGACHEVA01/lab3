import java.util.Arrays;

public class task1 {
    public static int[] removeAll(int[] numbers, int value) {
        int count = 0;

        for (int number : numbers) {
            if (number != value) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (number != value) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        int value = Integer.parseInt(args[args.length - 1]);
        int[] numbers = new int[args.length - 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        int[] result = removeAll(numbers, value);
        System.out.println(Arrays.toString(result));
    }
}