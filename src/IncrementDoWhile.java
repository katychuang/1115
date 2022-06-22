// Starting with integer i with value 1, increment until it is 10.

public class IncrementDoWhile {
  public static void main(String[] a){

    int x = 0;

    do{
      printNum(++x);
    } while(x <= 9);

  }

  public static void printNum(int i) {
    System.out.println(i); 
  }
}


