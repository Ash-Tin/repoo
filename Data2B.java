import java.util.*;
import java.io.*;

public class Data2B {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();

        File s = new File("data2.txt");
        Scanner scan = new Scanner(s);

        
        String firstLine = scan.nextLine();

        
        Scanner lineScan = new Scanner(firstLine);
        while (lineScan.hasNext()) {
            words.add(lineScan.next());
        }

        
        lineScan.close();
        scan.close();

        
        for (String w : words) {
            System.out.println(w);
        }
    }
}
