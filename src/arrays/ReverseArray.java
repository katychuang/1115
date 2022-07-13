/* This program will reverse an array */

package arrays;

public class ReverseArray {
  public static void main(String[] args){
    int[] arr = new int[5];
     
    // break actions into methods
    arr = createArray();
    display(arr); 
    arr = reverseArray(arr);
    display(arr);
  }

  // default access modifier is private
  static int[] createArray(){
    int[] newArr = { 1, 2, 3, 4, 5 };
    return newArr;
  }

  static void display(int[] elements){
    System.out.println("display()");
    for(int i = 0; i < elements.length; i++){
      System.out.println(elements[i]);
    }
  } 

  // this method reverses the input array and returns the reversed one
  static int[] reverseArray(int[] original){
    System.out.println("reverseArray()");
    System.out.println("i idx last new orig");
    //int[] newArr = { 5, 4, 3, 2, 1 };
    int size = original.length;
    int [] newArr = new int[size];
   
    // decreasing index numbers 
    for(int i = size-1; i >= 0; i--){
      int lastIdx = size-1;
      int idx = lastIdx - i; 
      newArr[i] = original[idx];
      System.out.printf("%d %3d %4d %3d %4d\n", i, idx, lastIdx, newArr[i], original[i]);


    }
    
    return newArr;
  }
  
}

/* Sample output
java arrays.ReverseArray
display()
1
2
3
4
5
reverseArray()
i idx last new orig
4   0    4   1    5
3   1    4   2    4
2   2    4   3    3
1   3    4   4    2
0   4    4   5    1
display()
5
4
3
2
1
*/
