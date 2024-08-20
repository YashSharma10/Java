import java.io.*;
public class FileRead {
    public static void main(String[] args){
        String line;
        int count=0;
        FileReader file = new FileReader("Text.txt");
        BufferedReader br = new BufferedReader(file);
        while((line=br.readLine()!=null)){
            String word[] =line.split("");
            count = count+word.length;
        }

    }
}
