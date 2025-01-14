package MapImplementation;
import java.util.ArrayList;

public class Map<K,V> {
    ArrayList <Mapnode<K,V>>buckets;
    int size;
    int numbuckets;


public Map()
{
    numbuckets=5;
    int i=0;
buckets= new ArrayList<>();
    while(i<numbuckets)
    {
        buckets.add(null);
        i++;
    }

}
public int getbucketindex(K key)
{
int hashcode=key.hashCode();

return hashcode%numbuckets;


}

public void insert(K key,V value)
{
    int bucketindex=getbucketindex(key);

    Mapnode<K,V>head=buckets.get(bucketindex);
    while(head!=null)
    {
       if(head.key.equals(key))
       {
        head.value=value;
        return;
       }

        head=head.next;
    }
    head=buckets.get(bucketindex);
    Mapnode<K,V>newelement=new Mapnode<>(key,value);
    size++;
    newelement.next=head;
    buckets.set(bucketindex,newelement);
    double loadfactor=(1.0*size())/numbuckets;
    if(loadfactor>0.7)
    {
        rehash();
    }
}

public int size()
{
 return size;
}
public V getvalue(K key)
{
int bucketindex=getbucketindex(key);
Mapnode<K,V>Head=buckets.get(bucketindex);
while(Head!=null)
{
if(Head.key.equals(key))
{
    return Head.value;
}


    Head=Head.next;
}
return null;

}
public V removekey(K key)
{
    int bucketindex=getbucketindex(key);
    Mapnode<K,V>head=buckets.get(bucketindex);
    Mapnode<K,V>prev=null;
    while(head!=null)
    {
if(head.key.equals(key))
{size--;
    if(prev==null)
    {
        buckets.set(bucketindex,head.next);
    }
    else{
    prev.next=head.next;
    }
return head.value;

    
    }
    prev=head;
    head=head.next;
}
return null;
}

private void rehash()
{System.out.println("rehashing starts"+":"+numbuckets);
    ArrayList <Mapnode<K,V>>temp=buckets;
    buckets=new ArrayList<>();
    numbuckets*=2;
    int i=0;
    while(i<numbuckets)
    {
        buckets.add(null);
        i++;
    }
    size=0;
    i=0;
    while(i<temp.size())
    {  Mapnode<K,V>head=temp.get(i);
        while(head!=null)
        {

      K key=head.key;
      V value=head.value;
      insert(key, value);


            head=head.next;
        }
        i++;

    }
}
public double loadfactor()
{
    return (1.0*size())/numbuckets;
}

}