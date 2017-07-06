import java.util.Scanner;

/**
 * Created by Steve on 7/6/2017.
 */
public class Array2DChallenge {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        System.out.println("We are going to create a 3 x 3 array.");

        userFilledArray(arr);

        System.out.println("The sum of the hourglass is: " + getSum(arr));

    }

    private static int[][] userFilledArray(int arr[][]){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Enter integers for row " + (i+1) + " column " + (j+1) + ": ");
                int userNum = scan.nextInt();

                arr[i][j] = userNum;
            }
        }
        return arr;
    }

    private static int getSum(int[][] arr) {
        int hourglassSum = arr[0][0] + arr [0][1] + arr[0][2] + arr [1][1] +
                arr[2][0] + arr [2][1] + arr[2][2];

        return hourglassSum;
    }
}
