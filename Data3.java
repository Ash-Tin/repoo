import java.util.*;
import java.io.*;

public class Data3 {
    public static void main(String[] args)  throws FileNotFoundException {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        File s = new File("data3.txt");
        Scanner scan = new Scanner(s);
        while(scan.hasNext()){
            nums.add(scan.nextInt());
        }
        scan.close();
        for (Integer e: nums ){
            System.out.println(e);
        }
        
        
        


    }
}
