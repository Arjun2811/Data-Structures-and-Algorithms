package PatternMatching;

public class TrieNode {

    char data;
    boolean isterminating;
    TrieNode children[];

    public TrieNode(char data)
    {
        this.data=data;
        isterminating=false;
        children= new TrieNode[26];
    }
}
