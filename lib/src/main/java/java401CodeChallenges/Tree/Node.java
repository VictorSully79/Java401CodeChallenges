package java401CodeChallenges.Tree;


    public class Node<T> {

    public Node left;
    public Node right;
    public T value;


    public Node(Node<T> left, Node<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }



    public Node<T> getLeft() {

        return left;
    }

    public Node<T> getRight() {

        return right;
    }

    public T getValue() {

        return value;
    }
}
