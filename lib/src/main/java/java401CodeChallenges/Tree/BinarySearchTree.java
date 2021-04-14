package java401CodeChallenges;



import java401CodeChallenges.Tree.Node;

public class BinarySearchTree<T extends Comparable<T>> {

    public void add(T value){
        Node node = new Node(null, null, value);
        if(this.root == null){
            this.root = node;

            return;
        }
    Node current = this.root;
        while(true){
            if(value.compareTo((T)current.value) < 0){
                if(current.left == null){
                    current.left = node;
                    return;
                }
                current = current.left;
            }
            else if(value == current.value) {
                return;
            }
            else{
                if(current.right == null){
                    current.right = node;
                    return;
                }
            }
        }
    }

    Node root;
    public BinarySearchTree(){

        root = null;
    }

    public int findMax(){

        return findMax(root);
    }

    public int findMax(Node node){
        if(node == null)
            return Integer.MIN_VALUE;

        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);

        int max = Math.max((int)node.value, leftMax);
        max = Math.max(max, rightMax);
        return max;
    }

}

