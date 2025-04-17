package PalindromePair;

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
    TrieNode child=root.Children[childindex];
    if(child==null)
    {
     child= new TrieNode(word.charAt(0));
        root.Children[childindex]=child;
        root.childcount++;
       
    }
   

    add(word.substring(1),child);
}

public boolean CheckRemainingword(TrieNode root,String newString )
{

if(root.childcount==0)
{
    if(Checkpalindrome(newString))
{
    return true;
}
return false;
}

int i=0;
while(i<26)
{
    if(root.Children[i]!=null)
    {
       TrieNode child=root.Children[i];
       newString+=child.data;
      boolean ans= CheckRemainingword(child,newString);
      if(ans==true)
      {
      return ans;
    }
    }
    i++;
}
return false;



}
    




public boolean searchforPP(String word,TrieNode root)
{if(word.length()!=0&&root.childcount==0)
    {
        return true;
    }

    if(word.length()==0)
    {
        if(root.childcount>0)
        {
            if(CheckRemainingword(root,""))
            {
                return true;

            }
            else{
                return false;
            }
        }
        else{
            return true;
        }
       
    }

int childindex=word.charAt(0)-'a';
TrieNode child= root.Children[childindex];
if(child==null)

{
    return false;
}




    Boolean ans=searchforPP(word.substring(1),child);
    return ans;
}



public void add(String word)
{
add(word,root);
}
public void addopposite(ArrayList<String>words)
{
int i=0;
while(i<words.size())
{String wordtoadd="";
    String word=words.get(i);
    int n=word.length()-1;
    while(n>=0)
    {
 wordtoadd+=word.charAt(n);
 n--;
    }
    add(wordtoadd);
    i++;

}
}
public boolean Checkpalindrome(String word)
{

    int i=0;
    int j=word.length()-1;
    while(i<=j)
    {
        if(word.charAt(i)!=word.charAt(j))
        {
            return false;
        }
        i++;
        j--;
    }
    return true;

}
public boolean PalindromePair(ArrayList<String>words)
{

addopposite(words);

int i=0;
while(i<words.size())
{
    String word=words.get(i);
    if(Checkpalindrome(word))
    {
        return true;
    }

    int childindex=word.charAt(0)-'a';
    TrieNode child=root.Children[childindex];
    if(child==null)
    {
        i++;
    }
    else
if(!searchforPP(word,root))
{
i++;
}
else{

    return true;

    }

}
 return false;
}
}







