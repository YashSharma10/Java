import java.util.Scanner;

class vehicle {
    void display(){
        System.out.println("This is Vehicle");
    }
}
class car extends vehicle{
    void print(){
        System.out.println("This is Car");
    }
}
class bike extends vehicle{
    void out(){
        System.out.println("This is bike");
    }
}
public class Vehicle_type{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tyres");
        int n = sc.nextInt();
        if(n==2){
            bike obj = new bike();
            obj.out();
        }
        else if(n==4){
            car obj1 = new car();
            obj1.print();
        }
        else{
            vehicle obj2 = new vehicle();
            obj1.display();
        }

    }
}
