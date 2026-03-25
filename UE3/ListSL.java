public class ListSL {
    public static class Node{
        private String value;
        private Node next;
        public Node(String value){
            this.value = value;
            this.next = null;
        }
        public String toString(){
            return value;
        }
    }
    private Node head;


    public ListSL(){
        this.head = null;
    }
    public void addFirst(String s){
       Node n = new Node(s);
       n.next= head;
       head = n;

    }
    public void append(String s){
        Node n=head;
        while((n!= null) && (n.next != null)){
            n= n.next;
        }
        if(n==null){
            this.head = new Node(s);
        }
        else{
            n.next=new Node(s);
        }
    }
    public boolean contains(String s){
        Node n=head;
        while(n!=null){
            if(s.equals(n.value)){
                return true;
            }
            n=n.next;
        }
        return false;
    }
    public int size(){
        Node n = head;
        int c = 0;
        while(n!= null){
            c++;
            n=n.next;
        }
        return c;
    }
    public String toString(){
        String s = new String();
        Node n=this.head;
        while(n!=null)
        {
            s+=" '"+n.toString()+"'";
            n = n.next;
        }
        return s;
    }
}
