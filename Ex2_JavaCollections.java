import java.util.Scanner;
import java.util.*;

public class Ex2_JavaCollections{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(int i=0;i<10;i++){
            String str = sc.next();

            //add into list
            list.add(str);

            //add to set
            set.add(str);

            //add to map
            int freq = map.getOrDefault(str,0);
            map.put(str,freq+1);
        }

        System.out.println("List Contains: ");
        for(String s:list){
            System.out.println(s);
        }
        System.out.print("\n");
        System.out.println("Set Contains: ");
        for(String s:set){
            System.out.println(s);
        }
        System.out.print("\n");
        System.out.println("Frequency of the words: ");
        for(String s:map.keySet()){
            System.out.println("Word = "+s+", Frequecy = "+map.get(s));
        }
    }

}