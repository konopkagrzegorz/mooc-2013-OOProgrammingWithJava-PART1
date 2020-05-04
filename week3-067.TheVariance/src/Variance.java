import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
       int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        double average = (double) sum/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        double variance = 0;
        for (int i = 0; i < list.size(); i++) {
            variance += (double)Math.pow(list.get(i) - average, 2);
        }
        return variance/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
