import java.util.Scanner;

/**
 * Created by Steve on 7/6/2017.
 */
public class Array2DChallenge {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("We are going to create a 3 x 3 array.");


        System.out.println("Choose the method to fill");
        System.out.println("Element by element : 1");
        System.out.println("Row by element : 2");

        int caseNumber = scan.nextInt();

        switch (caseNumber){
            case 1:
                userFilledArray(arr, scan);
                break;
            case 2:
                fillByRow(arr, scan);
                break;
            default:
                System.out.println("Oops enter 1 or 2!");
                break;
        }


        System.out.println("The sum of the hourglass is: " + getSum(arr));

    }

    private static int[][] userFilledArray(int arr[][], Scanner scan){

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Enter integers for row " + (i+1) + " column " + (j+1) + ": ");
                int userNum = scan.nextInt();

                arr[i][j] = userNum;
            }
        }
        return arr;
    }

    private static int[][] fillByRow(int arr[][], Scanner scan){

        for (int i = 0; i < 3; i++) {

            System.out.println("Select a row number don't repeat a line loop only runs 3 times");
            int rowNum = (scan.nextInt() - 1); // adjusts for conventional naming of row number

            for (int j = 0; j < arr[rowNum].length; j++) {

                System.out.print("Enter integers for row " + rowNum + " column " + j + ": ");
                int userNum = scan.nextInt();

                arr[rowNum][j] = userNum;
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
