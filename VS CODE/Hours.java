import java.util.*;
public class Hours{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours : ");
        int hours = sc.nextInt();
        int minute=hours*60;
        int seconds = hours*3600;
        System.out.println("In Minutes : "+minute+"\nIn Seconds : "+seconds);

    }
}