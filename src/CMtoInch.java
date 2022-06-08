/* This program takes an input number and returns the inch equivalent
 * Convert Metric (CM) to Imperial (Inch)
*/
import java.util.Scanner;

public class CMtoInch {
 public static void main(String[] a){
  Scanner sc = new Scanner(System.in);
  int cm;
  double in;   
  System.out.println("Enter a value for centimeters and press RETURN.");  

  cm = sc.nextInt();  
  // formula 1cm = 0.3937 in 
  in = cm * 0.3937;
 
  System.out.println(cm + " cm = " + in + " inches");

 }
}
