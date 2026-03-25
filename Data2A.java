import java.util.*;
import java.io.*;

public class Data2A {
    public static void main(String[] args)  throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<String>();
        File s = new File("data2.txt");
        Scanner scan = new Scanner(s);
        while(scan.hasNext()){
            words.add(scan.next());
        }
        for (String e: words ){
            System.out.println(e);
        }
        
        
        


    }

}
