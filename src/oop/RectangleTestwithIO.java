/* Calculate Rectangles from an input file 

   Input file name is passed in as a command line argument, like so:
   java RectangleTestwithIO rectangles.txt
*/

package oop;

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
//      rect2.displayInfo();

      Square s = new Square(w, l);
//      s.setLength(0.0);
//      s.setLength("abc");
//      s.displayInfo();
//      s.setWidth(1.4);
//      System.out.println(s.getWidth());

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
 
  Rectangle(double newWidth, double l){
    this.width = newWidth;
    length = l;
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

class Square extends Rectangle {
  //will need constructor to accept inputs
  Square(double w, double l){
    super(w,l);

    try{
      if (getWidth() == getLength()) {
        System.out.println("This is a square! " + getWidth());
      } else {
        throw new MyException("not a square");
      }
    } catch (Exception e){
      System.out.println(e);
    }
  }

  //override setLength() that was defined in Rectangle
  void setLength(double l){
    System.out.println("override");
  }

  void setLength(String s){
    System.out.println("overloaded");
  }
}


class MyException extends Exception { 
    public MyException(String errorMessage) {
        super(errorMessage);
    }
    public MyException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
