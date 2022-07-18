
/* comment */
public class RectangleTest {
  public static void main(String[] a){
    Rectangle rect = new Rectangle();
    System.out.println(rect.getWidth());
    
    rect.setWidth(1.5);
    System.out.println("Width = " + rect.getWidth());
    
    rect.setLength(2);
    System.out.println("Length = " + rect.getLength());

    System.out.println("Area = " + rect.getArea());
    System.out.println("Perimeter = " + rect.getPerimeter());

    System.out.println("Width Length  Area Perimeter");
    Rectangle rect2 = new Rectangle(4.20, 101.3);
    rect2.displayInfo();


/* demonstrate using non-private fields
    rect.protectedField = 4;
    System.out.println("protectedField = " + rect.protectedField);

    rect.publicField = 20;
    System.out.println("publicField = " + rect.publicField);
*/
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
    System.out.printf("%5.1f %6.1f %5.1f %5.1f", getWidth(), getLength(), getArea(), getPerimeter());   
  }
}
