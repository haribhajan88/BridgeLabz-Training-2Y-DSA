import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int[] factors = new int[10];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == factors.length) {
                    int[] temp = new int[factors.length * 2];
                    for (int j = 0; j < factors.length; j++)
                        temp[j] = factors[j];
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.println("Factors:");
        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");

        input.close();
    }
}
