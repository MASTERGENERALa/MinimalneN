package MinimalneN;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = getInteger("Введіть число N: ");
        List<Integer> numbers = getIntegerList(n);
        int minimum = getMinimum(numbers);
        System.out.println("Мінімальне число: " + minimum);
    }

    public static int getInteger(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int number = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера після введення числа
        return number;
    }

    public static List<Integer> getIntegerList(int n) {
        List<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Введіть число: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // Очищення буфера після введення числа
            numbers.add(number);
        }
        return numbers;
    }

    public static int getMinimum(List<Integer> numbers) {
        int minimum = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }
}



