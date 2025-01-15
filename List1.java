import java.util.ArrayList;
import java.util.*;

class List1{

    public List<List<String>> groupAnagrams(String[] strs){
        if(strs==null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs){
        //creating new charcount array for storing the elements of string
            int[] charCount = new int[30];
            for (char c : str.toCharArray()){
                charCount[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount){
                keyBuilder.append('#').append(count);
            }
            String key = keyBuilder.toString();

            anagramMap.computeIfAbsent(key, k-> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String args[]){

        String[] strs = {"subject", "object", "abcdef", "tea", "eat", "iceman", "cinema"};
        List1 list1 = new List1();

        List<List<String>> result = list1.groupAnagrams(strs);

        System.out.println("Anagram Groups:");
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("Group %d: %s%n", i + 1, result.get(i));
            }
    }
}
