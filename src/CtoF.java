/* This program takes an input number and returns the farenheit equivalent
 * Convert celsius to farenheit
*/
import java.util.Scanner;

public class CtoF {
 public static void main(String[] a){
  Scanner sc = new Scanner(System.in);
  double celsius;
  double farenheit;   
  System.out.println("Enter a value for celsius and press RETURN.");  

  celsius = sc.nextInt();
  // formula 1 celsius = (0°C × 9/5) + 32 = 32°F 
  farenheit = (celsius * 9/5) + 32;
 
  System.out.println(celsius + " celsius = " + farenheit + " farenheit");

 }
}
