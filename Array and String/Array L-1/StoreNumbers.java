import java.util.Scanner;

class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0;
        int index = 0;

        while (true) {
            double num = input.nextDouble();

            if (num <= 0 || index == 10)
                break;

            arr[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            sum += arr[i];
            System.out.println(arr[i]);
        }

        System.out.println("Sum = " + sum);

        input.close();
    }
}
