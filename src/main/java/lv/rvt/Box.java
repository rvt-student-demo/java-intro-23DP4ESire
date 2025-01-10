package lv.rvt;

public class Box {

  
    public double width()
    public double height()
    public double length()

    

    Box (double width, double height, double length) 

    Box (double side) 

    Box ( Box oldBox )


    double volume() {

    }
    


    double area() {
      return 2 * width() * height() + height() * length() + length() * width() ;
    }

    public Box biggerBox( Box oldBox )

}

