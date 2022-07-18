/* Calculate Rectangles from an input file 

   Input file name is passed in as a command line argument, like so:
   java RectangleTestwithIO rectangles.txt
*/

import java.util.Scanner;
import java.io.File;

public class RectangleTestwithIO {
  public static void main(String[] a) throws Exception {
    
    System.out.println("Width Length  Area Perimeter");

    Scanner sc = new Scanner(new File(a[0]));
    while(sc.hasNext()){
      double w = sc.nextDouble();
      double l = sc.nextDouble();

      Rectangle rect2 = new Rectangle(w, l);
      rect2.displayInfo();

    }
    
  }

  
}

class Rectangle {
  private double width;
  private double length;
  protected int protectedField;
  public int publicField;
 
  Rectangle(){
    // blank for now
  }
 
  Rectangle(double w, double l){
    width = w;
    length = l;
  }

  Rectangle(int i){
    width = i;
    length = i;
  }

  double getWidth(){
    return width;
  }

  void setWidth(double w){
    width = w;
  }

  double getLength(){
    return length;
  }

  void setLength(double l){
    length = l;
  }

  double getArea(){
//    double area = width * length;
    double area = getWidth() * getLength();
    return area;
  }

  double getPerimeter(){
    double perimeter = (2 * length) + (2 * width);
    return perimeter;
  }
  
  void displayInfo(){
    System.out.printf("%5.1f %6.1f %5.1f %5.1f\n", getWidth(), getLength(), getArea(), getPerimeter());   
  }
}
