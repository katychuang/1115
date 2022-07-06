/* Find the largest value in each row */
package findLargest;

import java.io.File;
import java.util.Scanner;


public class FromFile {
  public static void main(String[] args) throws Exception{
   Scanner sc = new Scanner(new File(args[0])); 
   int[][] matrix = new int[3][3];
   int rIdx = 0;
   while(sc.hasNextLine() && rIdx< 3){
    // String line = sc.nextLine();
    int[] row = new int[3];

    // String[] tokens = line.split(" ");
    int idx = 0;
    while(sc.hasNext() && idx < 3){
      int token = sc.nextInt();
      // System.out.print(token + " ");
      row[idx] = token;
      idx++;
    }
    System.out.println("largest value in row = " + findLargest(row));
    matrix[rIdx] = row;
    rIdx++;

   }

  }
  public static int findLargest(int[] a){
    int max=0;
    for(int i=0; i<a.length; i++){
      // System.out.println(a[i]);
      if(max < a[i]){
        max = a[i];
      }
    }
    return max;
  }
}

