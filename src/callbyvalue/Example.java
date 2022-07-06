
/* counting 1 thru 10 */

package callbyvalue;

public class Example {
  public static void main(String[] args){
    int i = 0; // variable declared in the main method
/*
    System.out.println("i = " + i);
    System.out.println("f(i) = " + f(i));
    System.out.println("f(i) = " + f(i,"anything"));
    System.out.println("i = " + i);
*/

 //   System.out.println("\n---\n");
    System.out.println("i = " + i);
    System.out.println("counter(i) = " + counter(i));
    System.out.println("i = " + i);

  }

  public static int counter(int i){
    /*
    for(int n = 10; i <= n; i++){
      System.out.print(i + " ");
    }
    while(i < 10){
      System.out.print(++i + " ");
    }
    */
 
    // recursive version of counting
    if(i < 10){
      System.out.print(++i + " ");
      counter(i);
    } 

    return i;
  }

  public static int f(int i, String s){
    return 3;
  }

  public static String f(int i){
    return "5";
  }
}
