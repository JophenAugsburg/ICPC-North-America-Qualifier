import java.util.ArrayList;
import java.util.Scanner;

public class TravelingMerchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int towns = scanner.nextInt();

        scanner.nextLine();

        //int[][] townData = new int[towns][2];
        ArrayList<int[]> townData = new ArrayList<>();

        int indexOfSmallest = 0;
        int smallestValue = Integer.MAX_VALUE;
        for (int i = 0; i < towns; i += 1) {
            String line = scanner.nextLine();
            String[] lineArr = line.split(" ");
            int[] tempArr = new int[] { Integer.parseInt(lineArr[0]), Integer.parseInt(lineArr[1]) };
            townData.add(tempArr);
            if (Integer.parseInt(lineArr[0]) < smallestValue) {
                indexOfSmallest = i;
                smallestValue = Integer.parseInt(lineArr[0]);
            }
        }
        
        for (int i = 0; i < towns; i += 1) {
            System.out.println("Town : " +  townData.get(i)[0] + " " + townData.get(i)[1]);
        }
        System.out.println("smallest Index: " + indexOfSmallest + " Val: " + smallestValue );

        int firstBuyAmount = townData.remove(indexOfSmallest)[0];

        int dayCounter = 1;
        while (townData.size() > 0) {
            if (dayCounter % 2 == 1) {
                // buys
            } else {
                // sells
            }
        }
    }

    public static int MonSun(ArrayList<int[]> arrList) {
        int indexOfSmallest = 0;
        int smallestValue = Integer.MAX_VALUE;
        for (int i = 0; i < arrList.size(); i += 1) {
            if (arrList.get(i)[0] < smallestValue) {
                indexOfSmallest = i;
                smallestValue = arrList.get(i)[0];
            }
        }
        return indexOfSmallest;
    }

    public static int TuesSat(ArrayList<int[]> arrList) {
        int indexOfLargest = 0;
        int largestValue = Integer.MIN_VALUE;
        for (int i = 0; i < arrList.size(); i += 1) {
            int calc = arrList.get(i)[0] + arrList.get(i)[1];
            if (calc > largestValue) {
                indexOfLargest = i;
                largestValue = arrList.get(i)[0];
            }
        }
        return indexOfLargest;
    }

    public static int WedFri(ArrayList<int[]> arrList) {
        int indexOfSmallest = 0;
        int smallestValue = Integer.MAX_VALUE;
        for (int i = 0; i < arrList.size(); i += 1) {
            int calc = arrList.get(i)[0] + (2 * arrList.get(i)[1]);
            if (calc < smallestValue) {
                indexOfSmallest = i;
                smallestValue = arrList.get(i)[0];
            }
        }
        return indexOfSmallest;
    }

    public static int Thur(ArrayList<int[]> arrList) {
        int indexOfLargest = 0;
        int largestValue = Integer.MIN_VALUE;
        for (int i = 0; i < arrList.size(); i += 1) {
            int calc = arrList.get(i)[0] + (3 * arrList.get(i)[1]);
            if (calc > largestValue) {
                indexOfLargest = i;
                largestValue = arrList.get(i)[0];
            }
        }
        return indexOfLargest;
    }
}