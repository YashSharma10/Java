import java.util.*;
public class string{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("hello ");
        System.out.println(sb);
        sb.append(" java");
        System.out.println(sb);
        sb.insert(1,"java");
        System.out.println(sb);
        sb.replace(1,3,"abc");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}