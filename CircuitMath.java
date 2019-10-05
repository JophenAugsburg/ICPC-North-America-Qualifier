import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CircuitMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Boolean[] tfArray = new Boolean[number];
        String[] characters = scanner.nextLine().split(" ");

        for (int i = 0; i < number; i += 1) {
            if (characters[i].equals("T")) {
                tfArray[i] = true;
            } else if (characters[i].equals("F")) {
                tfArray[i] = false;
            }
        }

        ArrayList<Boolean> stack = new ArrayList<>();
        int counter = 0;

        String tempLine = scanner.nextLine();

        // System.out.println("Temp Line = " + tempLine);

        String lineScan[] = tempLine.split(" ");

        // System.out.println("Before While Loop");

        for (int i = 0; i < lineScan.length; i++) {
            // System.out.println("Inside While");
            String temp = lineScan[i];
            // System.out.println(":" + temp);
            if (temp.equals("+")) {
                // System.out.println("Plus");
                Boolean first = stack.remove(stack.size() - 1);
                Boolean second = stack.remove(stack.size() - 1);
                stack.add(first || second);
            } else if (temp.equals("*")) {
                // System.out.println("Mult");
                Boolean first = stack.remove(stack.size() - 1);
                Boolean second = stack.remove(stack.size() - 1);
                stack.add(first && second);
            } else if (temp.equals("-")) {
                // System.out.println("Sub");
                Boolean first = stack.remove(stack.size() - 1);
                stack.add(!first);
            } else {
                // System.out.println("Add To Stack");
                stack.add(tfArray[counter]);
                counter += 1;
            }
        }

        if(stack.get(stack.size()-1)) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }

        System.exit(0);
    }
}