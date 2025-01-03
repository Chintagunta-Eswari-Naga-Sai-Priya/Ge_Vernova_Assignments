package Day9;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(70);
        linkedList.addFirst(30);
        linkedList.addFirst(56);
        linkedList.display(); // Output: 56 -> 30 -> 70 -> null
    }
}
