public class Node<E> {
    public Node<E> next;
    public E element;
    public Node() {
    }
    public Node(E element) {
        this.element = element;
    }
    public E getData(){
        return this.element;
    }
}
