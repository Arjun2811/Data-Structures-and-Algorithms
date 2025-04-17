package PatternMatching;

import java.util.ArrayList;

public class TrieUse {
public static void main(String[] args) {
    


    Trie t1= new Trie();
    ArrayList<String> arr= new ArrayList<>();

    arr.add("arjun");
    arr.add("this");

    t1.addSuffixtrie(arr);
    System.out.println(t1.search("n"));
}
}