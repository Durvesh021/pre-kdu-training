import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Ex3_FileOperations{

    public static void main(String[] args){

        //path to csv file
        String filepath = "E:\\Pre-KDU\\pre-kdu-training\\sampleInput.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            //map to store frequency of words
            Map<String,Integer> freqMap = new HashMap<String,Integer>(); 
            String line;
            while((line = br.readLine()) != null){
                //to seperate values with comma
                String[] values = line.split(",");
                for(String value:values){
                    //to fetch words from the value sentence
                    String[] words = value.split(" ");
                    for(String word:words){
                        //to check for empty strings
                        if(word.length()==0) continue;
                        int freq = freqMap.getOrDefault(word,0);
                        freqMap.put(word,freq+1);
                    }
                }
            }
            //storing sorted map entries into list using streams.
            List<Map.Entry<String,Integer>> topRepeatedWords = freqMap.entrySet().stream().sorted((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue())).collect(Collectors.toList());

            //printing the output
            int n = topRepeatedWords.size();
            for(int i=0;i<3&&i<n;i++){
                System.out.println(topRepeatedWords.get(i).getKey());
            }
        } catch (IOException e) { 
            e.printStackTrace();
        }
    }

}