package dsaLab;

import java.util.Scanner;

public class LargeAndSmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < N; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
