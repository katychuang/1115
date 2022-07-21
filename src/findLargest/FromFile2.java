/* Description
   Find the largest value in each row of the 2D array
   from input file.
    
   Input file starts with two lines describing the shape of the array. First line is the number of rows, and 2nd is the number of columns.
   Starting at line 3, contains the values for the array. 

  Running this program:
  $ java FromFile2 input.txt

*/

import java.util.Scanner;   // for scanning input
import java.io.File;        // for opening file

public class FromFile2 {
  public static void main(String[] args) throws Exception {

    // create new scanner
    Scanner sc = new Scanner(new File("input.txt"));

    int rows = sc.nextInt();
    System.out.println(rows + " rows");

    int cols = sc.nextInt();
    System.out.println(cols + " cols");

    int[][] matrix = new int[rows][cols];

    int[] newMatrix = new int[rows]; // for saving the largest value from each row

    // populate matrix. outer loop traverses rows
    for(int row = 0; row < matrix.length; row++){
      
      // populate elements in a row
      for(int col = 0; col < cols; col++){

        int token = sc.nextInt();  // next token
        matrix[row][col] = token;  // save token to matrix at row and col position
        System.out.print(matrix[row][col] + " ");
      }

      // find largest per row
      int[] arrRow = matrix[row];
      int max = largest(arrRow);

      newMatrix[row] = max;
    }

    int maxofMax = largest(newMatrix);


  }

  // find largest value in a row
  public static int largest(int[] arr){
    int idx = 0;
    int largest = -1;

    while(idx<arr.length){
      if(arr[idx] > largest){
        largest = arr[idx];
      }
      idx++;
    }    

    System.out.println("largest value found = " + largest); 
    return largest;
  }
}

