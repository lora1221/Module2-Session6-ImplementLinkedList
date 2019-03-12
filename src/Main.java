public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.addFirst(0);
        myList.addLast(2);
        System.out.println(myList.contains(2));
    }
}
