public class MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;



    public MyList(T... args) {
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
        Node<T> node;
        if (this.head == null) {
            node = new Node<>(value);
            this.head = node;
        } else {
            // New node with actual tail
            node = new Node<>(value, this.tail);
        }
        // Set new tail
        this.tail = node;
        this.size += 1;
    }

    public boolean exists(T value) {
        Node<T> current = this.head;
        while(current.getNext() != null) {
            System.out.println(current.getValue());
            if (current.getValue().equals(value)) {
                return true;
            } else {
                current = current.getNext();
            }
        }
        /*for(int i = 0; i < this.size; i++) {
            if (current.getValue().equals(value)) {
                return true;
            } else {
                current = current.getNext();
            }
        }*/
        return false;
    }


    public T get(int index) {
        Node<T> current = this.head;

        while(current.getNext() != null) {
            System.out.println(current.getIndex());
            if ( current.getIndex() == (index) ) {
                return current.getValue();
            } else {
                current = current.getNext();
            }
        }
        return current.getValue();
        /*for(int i = 0; i <= index; i++) {
            System.out.println(current.getIndex());
            if ( current.getIndex() == (index) ) {
                return current.getValue();
            } else {
                current = current.getNext();
            }
        }*/

    }

    public int indexOf(T value) {
        Node<T> current = this.head;
        while (current.getNext() != null) {
            if ( current.getValue().equals(value) ) {
                return current.getIndex();
            } else {
                current = current.getNext();
            }
        }
        /*for(int i = 0; i <= this.size; i++) {
            if ( current.getValue().equals(value) ) {
                return current.getIndex();
            } else {
                current = current.getNext();
            }
        }*/
        return !current.getValue().equals(value) ? -1 : current.getIndex();
    }

    public T remove(int index) {
        Node<T> current = this.head;
        while (current.getNext() != null) {
            if ( current.getIndex() == index ) {
                // Actualizar el siguiente
                current.getNext().setPrevious(current.getPrevious());
                // Actualizar el anterior
                current.getPrevious().setNext(current.getNext());
                this.size -= 1;
                return current.getValue();
            } else {
                current = current.getNext();
            }
        }
        /*for(int i = 0; i < index; i++) {
            if ( current.getIndex() == index ) {
                // Actualizar el siguiente
                current.getNext().setPrevious(current.getPrevious());
                // Actualizar el anterior
                current.getPrevious().setNext(current.getNext());
                this.size -= 1;
                return current.getValue();
            } else {
                current = current.getNext();
            }
        }*/
        this.size -= 1;
        return null;
    }

}
