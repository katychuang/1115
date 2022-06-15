/**
 * An example that illustrates basic file IO in Java
 */

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIODemo {

    public static void main(String[] args) throws Exception {

        int average;
        char grade;

        Scanner scanner = new Scanner(new File("roster.txt"));
        PrintStream ps = new PrintStream("grades.txt");

        while (scanner.hasNext()) {
            String name = scanner.next();
            String token2 = scanner.next();
            average = Integer.parseInt(token2);
            

            if (average >= 90) {
                grade = 'A';
            }
            else if (average >= 80) {
                grade = 'B';
            }
            else if (average >= 70) {
                grade = 'C';
            }
            else if (average >= 60) {
                grade = 'D';
            }
            else {
                grade = 'F';
            }

            ps.println(name + ": " + grade + " (" + average + ")");
        }
    }
}
