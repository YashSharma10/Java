class Person {
    String name;
    public Person(){
        System.out.println("Constructor of Parent class");
    }
    public void Display(){
        System.out.println("Parent");
    }
}
class Student extends Person{
    int marks;
    public Student(){
        System.out.println("Constructor of Child class");
    }
    public void Print(){
        System.out.println("Student");
    }
}
class Test{
    public static void main(String args[]){
        Student st = new Student();
        st.Display();
        st.Print();

    }
}
