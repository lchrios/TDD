public class Node<T> {

    private T value;
    private Node<T> next;
    private Node<T> previous;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> previous) {
        this.value = value;
        this.previous = previous;
    }


    public Node<T> getNext(){
        return this.next;
    }

    public Node<T> getPrevious(){
        return this.previous;
    }


    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public T getValue() {
        return this.value;
    }


}
