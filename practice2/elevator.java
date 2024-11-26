import java.io.*;
import java.util.Scanner;

public class elevator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter writer = new PrintWriter(new File("output.txt"));

        String door = scanner.next();
        int rail = scanner.nextInt();

        if (door.equals("front") && rail == 1) {
            writer.println("L");
        } else if (door.equals("front") && rail == 2) {
            writer.println("R");
        } else if (door.equals("back") && rail == 2) {
            writer.println("L");
        } else {
            writer.println("R");
        }

        writer.close();
        scanner.close();
    }
}