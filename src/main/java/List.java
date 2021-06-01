import java.util.NoSuchElementException;

public class List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;



    public List (T... args) {
        this.size = 0;

        for(T arg : args) {
            this.add(arg);
        }
    }

    public int getSize() {
        return this.size;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        System.gc();
    }

    public void add(T value) {
        Node<T> node = this.getTail();
        if (node == null) {
            this.head = new Node<T>(value);
            this.tail = this.head;
        } else {
            // New node
            node.setNext(new Node<T>(value, node));
            // Set new tail
            this.tail = node.getNext();
        }

        this.size += 1;
    }

    public boolean exists(T value) {
        Node<T> current = this.getHead();
        if (current != null) {
            do {
                if (current.getValue().equals(value)) return true;
            } while ((current = current.getNext()) != null);
        }
        return false;
    }


    public T get(int index) {
        // * Invalid index
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public int indexOf(T value) {
        Node<T> current = this.getHead();
        if (current == null) throw new NoSuchElementException("The list is currently empty");

        int index = 0;
        do {
            if(current.getValue().equals(value)) return index;
            index++;
        } while ((current = current.getNext()) != null);
        return -1;
    }

    public T remove(int index) {
        // * Invalid index
        if (index >= this.size || index < 0) throw new IndexOutOfBoundsException();

        if (index == 0) { // Remove head
            // remove next reference
            this.head.getNext().setPrevious(null);
            Node<T> tmp = this.head;
            // susbstitute head
            this.head = this.head.getNext();
            this.size--;
            return tmp.getValue();
        } else if (index == (this.size - 1)) { // remove tail
            // set prev reference to null
            this.tail.getPrevious().setNext(null);
            this.tail = this.tail.getPrevious();
        }

        Node <T> current = this.head;
        // Iterat until the desired node
        for(int i = 0; i < index; i++) current=current.getNext();

        // link previous and next

        System.out.println(current);

        System.out.print("Curr: ");
        System.out.println(current.getValue().toString());

        System.out.print("Prev: ");
        System.out.println(current.getPrevious().getValue().toString());

        System.out.print("Next: ");
        System.out.println(current.getNext().getValue().toString());

        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());

        return current.getValue();
    }

    public Node<T> getTail() {
        if (this.size == 0) {
            return null;
        }
        Node<T> current = this.head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    public  Node<T> getHead() {
        if (this.size == 0) {
            return null;
        }
        return this.head;
    }

    public String toString(){
        String res = "[";
        Node <T> current = this.head;
        for(int i = 0; i < this.size; i++){
            if(i == this.size - 1){
                res += current.getValue().toString();
            }
            else{
                res += current.getValue().toString() + ", ";
            }
            current = current.getNext();
        }
        res += "]";
        return res;
    }
}
