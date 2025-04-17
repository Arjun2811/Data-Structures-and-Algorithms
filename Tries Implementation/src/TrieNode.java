public class TrieNode {

    char data;
    boolean isTerminating;
    TrieNode Children[];
    int childcount;


public TrieNode(char data)
{
    this.data=data;
    isTerminating=false;
 Children=new TrieNode[26];
 childcount=0;
}
}