package AutoComplete;

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
        root.isTerminating=true;
        return;
    }

int childindex=word.charAt(0)-'a';
TrieNode child=root.children[childindex];
if(child==null)
{
    child= new TrieNode(word.charAt(0));
            root.children[childindex]=child;
            root.childCount++;
}
add(word.substring(1),child);

}
public void add(String word)
{
    add(word,root);
}
public void autocomplete(ArrayList<String>words,String incompleteword)
{if(incompleteword.length()==0)
    {
        return;
    }

    int i=0;
    while(i<words.size())
    {

         String word=words.get(i);
         add(word);
         i++;

    }
    String incompleteword2=incompleteword;
    findwords(incompleteword,root,incompleteword2);
}
public void findwords(String incompleteword,TrieNode root,String incompleteword2)
{
    if(incompleteword.length()==0)
    {
        if(root.childCount>0)
        {
findwords2(root,incompleteword2);
return;
    }
    else{
        return;
    }
    }
int childindex=incompleteword.charAt(0)-'a';
TrieNode child=root.children[childindex];
if(child==null)
{
return;
}
findwords(incompleteword.substring(1),child,incompleteword2);


}

public void findwords2(TrieNode root,String incompleteword)
{
   
    if(root.childCount==0)
    {System.out.println(incompleteword);
        return;
    }
    
    
    if(root.isTerminating)
    {
        System.out.println(incompleteword);
    }
    
  

int i=0;
while(i<26)
{
    if(root.children[i]!=null)
    {
        findwords2(root.children[i],incompleteword+root.children[i].data);
    }
    i++;
}
return;
}
}
