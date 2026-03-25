public class BinSerTree{
public static class Node{
        private int value;
        
        private Node left, right;
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
        public String toString(){
            return Integer.toString(value);
        }
    }
    private Node root;
    public BinSerTree(){
        this.root= null;
    }
    public void insert(int value){
        root = insertRec(root, value);
    }
    public Node insertRec(Node n, int value){
        if(n== null){
            return new Node(value);
        }
        if(value< n.value){
            n.left=insertRec(n.left, value);
        }
        else if (value>n.value){
            n.right= insertRec(n.right, value);
        }
        return n;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        toString(root, sb);
        return sb.toString();
    }
    private void toString(Node n, StringBuilder sb){
        if(n!=null){
            toString(n.left, sb);
            sb = sb.append(n.value);
            sb=sb.append(" ");
            toString(n.right, sb);
        }
    }
}