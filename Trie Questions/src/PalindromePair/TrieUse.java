package PalindromePair;

import java.util.ArrayList;

public class TrieUse {




    public static void main(String[] args) {
        Trie t1= new Trie();
        ArrayList<String>words= new ArrayList<>();
        words.add("abcm");
        words.add("cba");
       

      
        System.out.println(t1.PalindromePair(words));
    }
}
