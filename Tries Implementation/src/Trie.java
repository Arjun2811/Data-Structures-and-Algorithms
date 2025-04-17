public class Trie {

    TrieNode root;

    public Trie()
    {
       root=new TrieNode('\0'); 
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

    public void add(String word)
    {
add(word,root);
    }
public boolean search(String word,TrieNode root)
{

    if(word.length()==0)
    {
        return root.isTerminating;
    }

int childindex=word.charAt(0)-'a';
TrieNode child= root.Children[childindex];
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



public void delete(String word,TrieNode root)
{
if(word.length()==0)
{
    root.isTerminating=false;
    return;
}

int childindex=word.charAt(0)-'a';
TrieNode child=root.Children[childindex];
if(child==null)
{
    return;
}


    delete(word.substring(1),child);
if(!child.isTerminating&&child.childcount==0)
{
    child=null;
    root.childcount--;
    return;
}



}


    //one way of removing character by everytime counting the children of root
//     if(!child.isTerminating)
//     {int i=0;
// int numchildren=0;
//         while(i<26)
//         {
//             if(child.Children[i]!=null)
//             {
//                 numchildren++;
//             }
//             i++;
//         }
//         if(numchildren>0)
//         {
//             return;
//         }
//         else{
//             root.Children[childindex]=null;
//         }
//     }
// }


public void delete(String word)
{
    delete(word,root);
}
}