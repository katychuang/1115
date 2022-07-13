/* Assume we are working with a sorted array
  Search through array for an element
   
   Sequential search - search one by one


   Binary search - split array into subarrays,
      until array size of 1;
 */
package arrays;

public class Search {
  public static void main(String[] args){
   int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
   int k = 3;

   //SequentialSearch(a, k);
   BinarySearch(a, k);
  }

  // search for elements one by one
  public static void SequentialSearch(int[] array, int key){
    boolean found = false; 
    // iterate through array, from left to right
    for(int i = 0; i < array.length; i++){

    // check if each element is the one being searched for 
      if(array[i] == key){
        // if found, print index of array
        System.out.println("Found at position " + i); 
        found = true;
      } 
    } // end for loop

    // TODO: this should not print if the element is found
        // else, return "key not found" at the end of the loop 

      if(!found){ 
        System.out.println(key + " not found");
      }
  } 

  // attempt with recursion 
  public static void BinarySearch(int[] array, int key){
    // split array in half
    // decide which half to use
    // keep splitting until array size of 1
    // if found, return found
    // else "not found"
    System.out.println("lookin gfor key " + key);
    int mid = array.length / 2;
    int[] left = new int[mid];
    int[] right = new int[mid]; 
    System.arraycopy(array, 0, left, 0, mid);
    System.out.println("mid: " + mid + ", size: " + array.length);
    System.arraycopy(array, mid, right, 0, mid);
    display(left); 
    display(right);
    
    // decide which array to use: 
    // check left subarray last
    int leftLast = left[left.length-1];
    // check right subarray first
    int rightFirst = right[0];
 
    System.out.printf("\nLeft (last element): %d, Right (first element): %d\n", leftLast, rightFirst); 

    if(key <= leftLast){
      System.out.println("left");
    }
    
    if(rightFirst <= key){
      System.out.println("right");
    }

  } 

  public static void display(int[] a){
    System.out.print("\n display array  ");
    for(int i =0; i<a.length;i++){
      System.out.print(a[i] + " ");
      if(i==a.length)
        System.out.println();
    }
  }

}








