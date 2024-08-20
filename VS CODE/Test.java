class Shape {
    public void m(){
        System.out.println("This is Shape");
    }
}
class Rectangle extends Shape{
    public void m1(){
        System.out.println("This is Rectangle");
    }
}
class Square extends Rectangle{
    public void m2(){
        System.out.println("This is Square");
    }
}
class Test{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        Square s = new Square();
        r.m();
        r.m1();
        System.out.println("****");
        s.m();
        s.m1();
        s.m2();

    }
}