public class TrieUse {

    public static void main(String[] args) {
        Trie t1= new Trie();
        t1.add("areaaa");
        t1.add("area");
        System.out.println(t1.search("area"));
        t1.delete("area");
        System.out.println(t1.search("area"));



    }
}
