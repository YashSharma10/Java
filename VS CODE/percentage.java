import java.util.*;
public class percentage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of student :");
        Float a = sc.nextFloat(); 
        Float b = sc.nextFloat(); 
        Float c = sc.nextFloat(); 
        Float d = sc.nextFloat(); 
        Float e = sc.nextFloat(); 
        Float sum = a*b*c*d*e;
        Float p = sum/5;
        System.out.println("percentage is ="+p);
        if(p<25){
            System.out.println("f grade");
        }
        else if(p>25&&p<40){
            System.out.println("e grade");
        }
        else if(p>40&&p<50){
            System.out.println("d grade");
        }
        else if(p>50&&p<60){
            System.out.println("c grade");
        }else if(p>60&&p<80){
            System.out.println("b grade");
        }
        else{
            System.out.println("a grade");
        }

    }
}