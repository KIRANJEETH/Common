package dump;
import java.util.LinkedList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();
        int[] arr = {14, 5, 7, 17, 6};
        int sum = 0;

        for (int data : arr) {
            sum = 0;
            for (int i = 2; i <= data / 2; i++) {
                if (data % i == 0)
                    sum = sum + i;
            }
            if (sum == 0 && data > 1) li.add(data);
        }

        List<String> res = new LinkedList<>();
        for (int data : li) {
            int tsum = sumOfDigits(data);
            int fact = factorial(data);
            res.add(data + " -> SumOfDigits: " + tsum + ", Factorial: " + fact);
        }

        System.out.println("Primes with details:");
        for (String s : res) {
            System.out.println(s);
        }
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
