import java.util.Scanner;

class Convert2Dto1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = input.nextInt();

        int[] oneD = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                oneD[index++] = arr[i][j];

        for (int i = 0; i < oneD.length; i++)
            System.out.print(oneD[i] + " ");

        input.close();
    }
}
