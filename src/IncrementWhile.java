// Starting with integer i with value 0, increment until it is 10.

public class IncrementWhile {
  public static void main(String[] a){

    int x = 1;

    while(x <= 10){
      printNum(x++);
    }

  }

  public static void printNum(int i) {
    System.out.println(i); 
  }
}


