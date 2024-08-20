package Maps;
import java.util.*;
import java.util.LinkedList;
public class CarParking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> driveway = new Stack<Integer>();
        Queue<Integer> streetLane = new LinkedList<Integer>();
        
        for (int i = 1; i <= 10; i++) {
            driveway.push(i);
        }
        
        System.out.println("Enter the vehicle number you want to take from the parking: ");
        int s = sc.nextInt();
        boolean found = false;
        
        while (!driveway.isEmpty()) {
            int vehicle = driveway.pop();
            if (vehicle == s) {
                found = true;
                break;
            } else {
                streetLane.add(vehicle);
            }
        }
       
        System.out.println("Vehicles in Streetlane: " + streetLane);
        
        if (found) {
            System.out.println("Vehicle " + s + " has been removed from the parking.");
        } else {
            System.out.println("Vehicle " + s + " was not found in the parking.");
        }
        
       
        Stack<Integer> temp = new Stack<Integer>();
        while (!streetLane.isEmpty()) {
            temp.push(streetLane.poll());
        }
        while (!temp.isEmpty()) {
            driveway.push(temp.pop());
        }
        
        System.out.println("After removing the vehicle in driveway: " + driveway);
        System.out.println("YASH SHARMA 22CSU295");
    }
}