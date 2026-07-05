import java.util.*;
public class duplicates{
    public static void main(String[] args){
        int[] input= {12,34,12,45,67,89};
        Set<Integer> set=new LinkedHashSet<>();
        for(int num:input){
            set.add(num);
        }
        System.out.println("O/P: "+set);
    }
}