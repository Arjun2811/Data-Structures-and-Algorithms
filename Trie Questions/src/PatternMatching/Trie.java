package PatternMatching;

import java.util.ArrayList;

public class Trie {

    TrieNode root;

    public Trie()
    {
        root= new TrieNode('\0');
    }

public void add(String word,TrieNode root)
{

    if(word.length()==0)
    {
        root.isterminating=true;
        return;
    }

int childindex=word.charAt(0)-'a';
TrieNode child=root.children[childindex];
if(child==null)
{
    child= new TrieNode(word.charAt(0));
            root.children[childindex]=child;
}



add(word.substring(1),child);

}

    public void addSuffixtrie(ArrayList<String>words)
    {int i=0;

        while(i<words.size())
        {

            int f=0;
            String word=words.get(i);
            while(f<word.length())
            {

add(word.substring(f),root);
f++;
            }
            i++;
           
        }

   
    }
    public boolean search(String word,TrieNode root)
{

    if(word.length()==0)
    {
        return root.isterminating;
    }

int childindex=word.charAt(0)-'a';
TrieNode child= root.children[childindex];
if(child==null)

{
    return false;
}




    Boolean ans=search(word.substring(1),child);
    return ans;
}




    public boolean search(String word)
    {
       boolean ans= search(word,root);
       return ans;
    }
}
