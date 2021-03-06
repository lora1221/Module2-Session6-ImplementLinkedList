public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int numNode = 0;
    public LinkedList(){
    }
    public LinkedList(Node<E> element) {
        head = element;
        tail = element;
        numNode ++;
    }

    public void addFirst(E element) {
        Node current = new Node(element);
        if (head == null) {
            head = current;
            tail = current;
        } else {
            current.next= head;
            head = current;
        }
        numNode++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        numNode++;
    }

    public void add(int index, E element) {
        if (index  == 0) {
            addFirst(element);
        } else if (index >= numNode) {
            addLast(element);
        } else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = new Node(element);
            (current.next).next = temp;
        }
        numNode++;
    }

    public E removeFirst(){
        if (numNode == 0) {
            return null;
        } else {
            Node current = head;
            head = current.next;
            numNode --;
            return (E)current.element;
        }
    }

    public E removeLast(){
        if (numNode == 0) {
            return null;
        } else if (numNode == 1) {
            Node current = head;
            head = null;
            tail = null;
            numNode --;
            return (E)current;
        } else {
            Node current = head;
            Node previous = head;
            while(current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            numNode--;
            return (E)current.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNode) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == numNode -1){
            return removeLast();
        } else {
            Node previous = head;
            for (int i = 1; i < index; i++){
                previous = previous.next;
            }
            Node temp = previous.next;
            previous.next = temp.next;
            numNode --;
            return (E) temp.element;
        }
    }
    public int size(){
        return numNode;
    }

    public boolean contains(E element) {
        if (numNode == 0) {
            return false;
        } else {
            Node current = head;
            while (current != null) {
                if (current.element == element) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    public int indexOf(E element) {
        if (numNode == 0) {
            return -1;
        } else {
            Node current = head;
            for (int i = 0; i< numNode; i++) {
                if (current.element == element) {
                    return i;
                }
                current = current.next;
            }
            return -1;
        }
    }

    public void clear(){
        Node current = head;
        while(head != null) {
            current = null;
            head = head.next;
            current = head;
        }
        numNode = 0;
    }
    public E getFirst(){
        if (head == null) {
            return null;
        } else {
            return head.element;
        }
    }

    public E getLast(){
        if (head == null) {
            return null;
        } else {
            return tail.element;
        }
    }

    public void printOut() {
        if (head == null) {
            System.out.println("EMPTY LIST");
        } else {
            Node current = head;
            while (current.next != null) {
                System.out.print(current.element + " ");
                current = current.next;
            }
            System.out.println(current.element);
        }
    }


}
