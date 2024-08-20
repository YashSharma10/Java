interface GeometricObject1 
{ 
    public double getArea();    
    public double getPerimeter(); 
} 
interface Resizable { 
 public void resize(int percent); 
} 
class Circle implements GeometricObject1 
{ 
    double radius= 1 ;     
    double area,peri; 
 
    public Circle(double radius) {         
        this.radius = radius; 
    } 
 
    public double getRadius() {         
        return radius; 
    } 
 
    public double getArea() {        
     area = radius*radius*3.14;        
     return area; 
    } 
    public double getPerimeter() 
    { 
        peri=2*3.14*radius;         
        return peri; 
    }
} 
class ResizableCircle extends Circle implements Resizable {    
     public ResizableCircle() { 
        this(1.0); 
    } 
 
    public ResizableCircle(double radius) { 
        super(radius); 
    } 
 
    @Override 
    public void resize(int percent) {         radius =radius+(radius* (percent / 100.0)); 
    } 
} 
public class Circlemain{ 
    public static void main(String[] args) { 
        Circle circle = new Circle(5); 
        System.out.println("Circle: radius = " + circle.getRadius() + ", area = " + circle.getArea() + ", perimeter = " + circle.getPerimeter()); 
 
        ResizableCircle resizableCircle = new ResizableCircle(7); 
        System.out.println("ResizableCircle: radius = " + resizableCircle.getRadius() + ", area = " + resizableCircle.getArea() + ", perimeter = " + resizableCircle.getPerimeter()); 
        resizableCircle.resize(-10); 
        System.out.println("After resizing  radius = " + resizableCircle.getRadius() + ", area = " + resizableCircle.getArea() + ", perimeter = " + resizableCircle.getPerimeter()); 
    } 
}