public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

        myList.addFirst(0);
        myList.addFirst(2);
        myList.addLast(1);
        myList.addLast(9);
        myList.add(2,99);
        myList.add(4,44);
//        System.out.println(myList.removeFirst());
//        System.out.println(myList.removeFirst());
//        System.out.println(myList.removeLast());
//        System.out.println(myList.size());
//        System.out.println(myList.indexOf(0));
//        myList.clear();
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
//
//        System.out.println(myList.remove(4));
        myList.printOut();

    }
}
