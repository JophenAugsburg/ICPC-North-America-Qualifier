import java.util.Scanner;

public class TravelingMerchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int towns = scanner.nextInt();

        scanner.nextLine();

        int[][] townData = new int[towns][2];

        int indexOfLargest = 0;
        int largestValue = Integer.MIN_VALUE;
        for (int i = 0; i < towns; i += 1) {
            String line = scanner.nextLine();
            String[] lineArr = line.split(" ");
            townData[i][0] = Integer.parseInt(lineArr[0]);
            townData[i][1] = Integer.parseInt(lineArr[1]);
            if (Integer.parseInt(lineArr[0]) > largestValue) {
                indexOfLargest = i;
                largestValue = Integer.parseInt(lineArr[0]);
            }
        }
        
        for (int i = 0; i < towns; i += 1) {
            System.out.println("Town : " +  townData[i][0] + " " + townData[i][1]);
        }
        System.out.println("Largest Index: " + indexOfLargest + " Val: " + largestValue );

    }
}