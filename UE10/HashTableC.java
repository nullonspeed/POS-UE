public class HashTableC {
    private static class Node{
        private String key;
        private Node next;
        
        public Node(String key, Node next){
         this.key = key;
         this.next = next;   
        }
    }
    private static final int HT_SIZE = 7;
    private Node[] ht=null;
    private int size;
    public HashTableC(){
        ht = new Node[HT_SIZE];
        size = 0;

    }
    public int indexOff(int i){
        i = i%ht.length;
        return(i>=0)?i :(i+ht.length);
    }
    public boolean add(String key){
        int i = indexOff(HashFunction.hashCode(key));
         Node n = ht[i];
         while ((n!=null)) {
            if(n.key.equals(key)) return false;
            n = n.next;
            
         }
         ht[i] = new Node(key, ht[i]);
         size++;
         return true;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }


public boolean remove(String key){
    int i = indexOff(HashFunction.hashCode(key));
    Node n = ht[i];
    Node prev = null;
    

    while(n!=null){
        if(n.key.equals(key)){
            if(prev==null){
                ht[i]=n.next;

            }else{}
        }
    }

}
}