import java.io.*;
public class File{
    public static void main(String[] args) {
        String line;
        int count = 0;
        FileReader fr = new FileReader("hello.txt");
        BufferedReader br = new BufferedReader();
        while((line = br.readline())!=null){
            String word = line.split(" ");
            count = count + word.length;
        }
        System.out.println(count);
        br.close();

    }
}