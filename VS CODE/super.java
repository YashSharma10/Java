class Animal{
    protected String type = "animal";
}
class Dog extends Animal{
    public String type = "mammel";
    public void printType(){
        System.out.println("I am a "+type);
        System.out.println("I am a "+super.type);
    }
}
class Super{
    public static void main(String args[]){
        Dog dog1 = new Dog();
        dog1.printType();
    }
}