package Day9;

public class Queue<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void enqueue(T data) {
        linkedList.add(data);
    }

    public T dequeue() {
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.removeFirst();
    }

    public void display() {
        linkedList.display();
    }
}
