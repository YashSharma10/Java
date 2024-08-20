Interface FirstInterface{
    public void method();
}
Interface Otherinterface{
    public void othermethod();
}
class Demo implements interface , otherinterface{
    public Void method(){
        System.out.println("TEXT");
    }
    public void othermethod(){
        System.out.println("text");
    }
}
class Main{
    public static void main(System.in){
        Demo obj = new Demo();
        obj.method();
        obj.othermethod();
    }
}
