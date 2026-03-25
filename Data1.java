import java.util.*;
import java.io.*;

public class Data1 {
    public static void main(String[] args)  throws FileNotFoundException {
        String[] words;
        File s = new File("data1.txt");
        Scanner scan = new Scanner(s);
        String z = scan.nextLine();
        scan.close();
        words = z.split(":");
        
        for (String e: words){
            System.out.println(e);
        }

    }
}