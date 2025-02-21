
public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value){
        this.value=value;
    }

    public void printNode(){
        System.out.println("Узел имeет значение: "+value);
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(final int value){
        this.value=value;
    }

    public Node getLeftChild(){
        return this.leftChild;
    }

    public void setLeftChild(Node leftChild){
        this.leftChild=leftChild;
    }

    public Node getRightChild(){
        return this.rightChild;
    }

    public void setRightChild(final Node rightChild){
        this.rightChild=rightChild;
    }
}
