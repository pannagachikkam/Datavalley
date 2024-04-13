public class Divisibleby5and2 {
    public static void main(String[] args) {
        int[] values = {102, 54, 44, 99, 61, 40, 90};
        int sum = 0;

        for (int value : values) {
            if (isDivisibleBy5And2(value)) {
                sum += value;
            }
        }

        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }
    
    public static boolean isDivisibleBy5And2(int value) {
        return value % 5 == 0 && value % 2 == 0;
    }
}
