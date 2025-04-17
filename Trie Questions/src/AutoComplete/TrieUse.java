package AutoComplete;

import java.util.ArrayList;

public class TrieUse {

public static void main(String[] args) {
    ArrayList<String>arr= new ArrayList<>();
    Trie t1= new Trie();
    arr.add("do");
    arr.add("dont");
    arr.add("no");
    arr.add("not");
    arr.add("note");
    arr.add("notes");
    arr.add("den");
    t1.autocomplete(arr, "de");
}


}
