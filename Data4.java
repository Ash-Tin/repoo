import java.util.*;
import java.io.*;

public class Data4 {
    public static void main(String[] args)  throws FileNotFoundException {
        ArrayList<Double> nums = new ArrayList<Double>();
        File s = new File("data4.txt");
        Scanner scan = new Scanner(s);
        while(scan.hasNext()){
            nums.add(scan.nextDouble());
        }
        scan.close();
        for (Double e: nums ){
            System.out.println(e);
        }                       
    }
}
