/* Local time using the java.time package
   https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html
*/

package arrays;

import java.time.LocalTime;

public class ArrTime {
  public static void main(String[] args){
    LocalTime[] arr = new LocalTime[3];

    for(int i=0; i<3; i++){
      arr[i]=LocalTime.now();
    }

    for(int i=0; i<arr.length; i++){
      // System.out.println(arr[i]); 
      String s = arr[i].toString();
      System.out.println(s);
    }
  }
}
