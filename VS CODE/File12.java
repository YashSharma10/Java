import java.io.BufferedReader;  
import java.io.FileReader;  
  
public class File12
{  
    public static void main(String[] args) throws Exception {  
        String longest ,word;  
        int count = 0;  
  
        //Opens a file in read mode  
        FileReader file = new FileReader("hello.txt");  
        BufferedReader br = new BufferedReader(file);  
  
        //Gets each line till end of file is reached  
        while((longest = br.readLine()).hasNext()) {  
            //Splits each line into words  
            String words[] = longest.split(" ");  
            if(word.length()>longest.length()){
                longest=word;
            }
  
        }  
  
        System.out.println("Number of words present in given file: " + longest);  
        br.close();  
    }  
}