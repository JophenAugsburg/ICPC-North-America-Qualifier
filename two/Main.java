import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temps = scanner.nextLine().split(" ");

        int[][] output = new int[Integer.parseInt(temps[1])][2];
        
        for (int i = 0; i < Integer.parseInt(temps[0]); i += 1) {
            String[] line = scanner.nextLine().split(" ");

            output[Integer.parseInt(line[0])-1][0] += Integer.parseInt(line[1]);
            output[Integer.parseInt(line[0])-1][1] += Integer.parseInt(line[2]);
        }

        String[] lineOutputs = new String[output.length+1];

        for (int i = 0; i < output.length; i += 1) {
            int aPer = output[i][0];
            int bPer = output[i][1];
            int temp = ((aPer + bPer) / 2) + 1;
            System.out.println(temp);
            String winner = "";
            int aWaste = 0;
            int bWaste = 0;
            if (aPer > bPer) {
                winner = "A";
                aWaste = aPer - temp;
                bWaste = bPer;
            } else {
                winner = "B";
                aWaste = aPer;
                bWaste = bPer - temp;
            }
            System.out.println(winner + " " + aWaste + " " + bWaste);
            lineOutputs[i] = winner + " " + aWaste + " " + bWaste;
        }
        System.out.println("\n");
        for (int i = 0; i < lineOutputs.length; i += 1) {
            System.out.println(lineOutputs[i]);
        }
    }
}