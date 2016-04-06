//find all anagrams in and ArrayList<String>
package com.examples.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagarams {
    
    public void findAnagrams(List<String> lst){
        HashMap<String, ArrayList<String>> hmap= new HashMap<String,ArrayList<String>>();
        for (String word : lst) {
           char[] ch=  word.toCharArray();
           Arrays.sort(ch);
          String sortedWord=new String(ch);
           System.out.println(sortedWord);
           if(!hmap.containsKey(sortedWord)){
               ArrayList<String> wordLst= new ArrayList<String>();
               wordLst.add(word);
               hmap.put(sortedWord,wordLst);
           }else{
               hmap.get(sortedWord).add(word);
           }
        }
        System.out.println(hmap.values());
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> lst = new ArrayList<String>(Arrays.asList("link","post","pots","stack","stop","tops"));
        Anagarams an = new Anagarams();
        an.findAnagrams(lst);
    }

}
