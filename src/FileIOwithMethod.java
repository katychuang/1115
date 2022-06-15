/**
 * An example that illustrates basic file IO in Java
 */

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIOwithMethod {

    public static void main(String[] args) throws Exception {

        int average;
        char grade;
        String name;

        Scanner scanner = new Scanner(new File("roster2.txt"));
        PrintStream ps = new PrintStream("grades.txt");

        while (scanner.hasNext()) {
            average = scanner.nextInt();
            name = scanner.next();
            //String token2 = scanner.next();
            //average = Integer.parseInt(token2);
            grade = grade(average);            

//            System.out.println(name + "\t" + grade + "\t (" + average + ")");
            System.out.printf("%s\t%d\t%c\n",name,average,grade);
        } // ends while loop
    } // ends main method

  public static char grade(int average){
    char grade;

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

    return grade;
  }

}
