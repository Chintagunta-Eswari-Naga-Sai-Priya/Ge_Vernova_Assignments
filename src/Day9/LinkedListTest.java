package Day9;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        linkedList.display(); // Output: 56 -> 30 -> 70 -> null
    }
}
