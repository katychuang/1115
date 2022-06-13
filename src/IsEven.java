// Program to check Parity.
// Checks if a number is even

import java.util.Scanner;

public class IsEven {
  public static void main(String[] a){
    System.out.print("Enter a number: "); 
    // Get an input number
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

    int x = i%2;
    //System.out.println(x);
    //String s = Integer.toString(i);
    String output = String.valueOf(i);

    // Check if number is even
    // If even, return "This number is an even number."
    // Else, return "This number is not an even number."

    if(x==0){
      // is even
      output = output.concat(" is an even number.");
    } else {
      // is not even
      output = output.concat(" is not an even number");
    }
    
    System.out.println(output); 

  }
}
