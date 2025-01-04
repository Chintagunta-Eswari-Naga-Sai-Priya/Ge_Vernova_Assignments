package Day9;
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.display();

        System.out.println("Dequeued element: " + queue.dequeue());
        queue.display(); // Output: 30 -> 70 -> null
    }
}
