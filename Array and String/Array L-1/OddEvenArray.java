import java.util.Scanner;

class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number");
            return;
        }

        int[] even = new int[number];
        int[] odd = new int[number];

        int e = 0, o = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.println("Even:");
        for (int i = 0; i < e; i++) System.out.print(even[i] + " ");

        System.out.println("\nOdd:");
        for (int i = 0; i < o; i++) System.out.print(odd[i] + " ");

        input.close();
    }
}
