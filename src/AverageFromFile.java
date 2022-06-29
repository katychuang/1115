/* This program takes numbers from a file (one number each line) and calculates the average.
   The input file is provided as a command line argument, as is the number of lines in the file 
    java AverageFromFile $(wc -l numbers.txt)
    
    $(wc -l numbers.txt) provides the values '6 numbers.txt'

    Note: The counter variable is redundant when you use arrays because you can use the array size instead. 
          That being said, declaring a counter variable and using it is provided in this program as an example
*/

import java.util.Scanner;
import java.io.File;

public class AverageFromFile {
  public static void main(String[] args) throws Exception{

    System.out.println("Number of lines in file: " + args[0]);
    System.out.println("Filename: " + args[1]);


    // create an empty array with the right size
    int size = Integer.parseInt(args[0]);
    int[] numbers = new int[size];

    /* other ways to declare arrays

    int[] sample = {1, 5, 10, 2, 3, 7};
    int[] s2 = new int[]{1,5,10,2,3,7};

    */

    // filename from args[1]
    Scanner in = new Scanner(new File(args[1]));

    // change default delimiter from whitespace to newline character
    in.useDelimiter("\n");

    // declare variables to keep track of sum and counter
    int sum = 0;
    int counter = 0;  

    // print table heading 
    System.out.println("\n sum  counter   array size");
    System.out.println("----  -------   ----------");
    while(in.hasNext()){

      // read in the valid number tokens and add to sum
      int num = in.nextInt();
      numbers[counter]=num;  // set the element in the array with the value
      sum += num;     // add input number to the sum
      counter++;      // increment counter

      System.out.printf(" %3d %7d  %10d\n", sum, counter, numbers.length);
    }  // end while

    // After all the input numbers are added together, we can calculate the average
    // to make sure the average value is not X.0, type cast to a floating point type
    // since we have arrays in this program, using numbers.length to use array size would have been preferrable.
    System.out.printf("\nAverage = %.2f\n", ((double)sum/counter) ); 

  }
}
