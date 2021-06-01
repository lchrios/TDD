public class Node<T> {

    private T value;
    private int index;
    private Node<T> next;
    private Node<T> previous;

    public Node(T value) {
        this.value = value;
        this.index = 0;
    }

    public Node(T value, Node<T> previous) {
        this.value = value;
        this.previous = previous;
        this.index = previous.getIndex();
    }

    public int getIndex() {
        return this.index;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public Node<T> getPrevious(){
        return this.previous;
    }

    public void updateIndex() {
        this.index = this.previous.index++;
        if (this.getNext() != null) {
            this.getNext().updateIndex();
        }
    }

    public void setNext(Node<T> next) {
        this.next = next;
        this.updateIndex();
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
        this.updateIndex();
    }

    public T getValue() {
        return this.value;
    }


}
