import java.io.*;
public class Exception{
    public static void main(String[] args){
        try{
            int[] numbers = {1,2,3};
            int result = numbers[4];
            System.out.println("Results : "+result);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("error occured "+ex.getMessage());
        }
    }
}